package hust.soict.dsai.aims.store;
import java.util.LinkedList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc; 
public class Store {
    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();

    private boolean checkDVD(DigitalVideoDisc disc){
        for (DigitalVideoDisc discInlist : itemsInStore){
            if (discInlist.equals(disc)){
                return true;
            }
        }
        return false;
    }
    public void removeDVD(DigitalVideoDisc disc){
        if (checkDVD(disc)){
            itemsInStore.remove(disc);
            System.out.println(disc.getTitle()+"have been removed!");
        }
        else{
            System.out.println(disc.getTitle()+"is not in the store!");
        }
    }
    public void addDVD(DigitalVideoDisc disc){
    if (!checkDVD(disc)){
        itemsInStore.add(disc);
        System.out.println(disc.getTitle()+"is added to the store!");
    }else{
        System.out.println("Cannot add because "+disc.getTitle()+" is already in the store!");
        }
    }
    @Override //redefine the method inside object of java
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no dvd in the store !\n");
        else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }

}

