package hust.soict.dsai.aims.store;
import java.util.LinkedList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc; 
public class Store {
    private LinkedList<DigitalVideoDisc> itemInStore = new LinkedList<DigitalVideoDisc>();

    private boolean checkDVD(DigitalVideoDisc disc){
        for (DigitalVideoDisc discInlist : itemInStore){
            if (discInlist.equals(disc)){
                return true;
            }
        }
        return false;
    }
    public void removeDVD(DigitalVideoDisc disc){
        if (checkDVD(disc)){
            itemInStore.remove(disc);
            System.out.println(disc.getTitle()+"have been removed!");
        }
        else{
            System.out.println(disc.getTitle()+"is not in the store!");
        }
    }
    public void addDVD(DigitalVideoDisc disc){
    if (!checkDVD(disc)){
        itemInStore.add(disc);
        System.out.println(disc.getTitle()+"is added to the store!");
    }else{
        System.out.println("Cannot add because "+disc.getTitle()+" is already in the store!");
        }
    }

}

