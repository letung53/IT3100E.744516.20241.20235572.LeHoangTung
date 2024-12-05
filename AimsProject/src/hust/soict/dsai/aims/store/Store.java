package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.Media.Media; 

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    private boolean checkMedia(Media disc){
        for (Media discInlist : itemsInStore){
            if (discInlist.equals(disc)){
                return true;
            }
        }
        return false;
    }
    public void removeMedia(Media item){
        if (checkMedia(item)){
            itemsInStore.remove(item);
            System.out.println(item.getTitle()+"have been removed!");
        }
        else{
            System.out.println(item.getTitle()+"is not in the store!");
        }
    }
    public void addMedia(Media item){
    if (!checkMedia(item)){
        itemsInStore.add(item);
        System.out.println(item.getTitle()+"is added to the store!");
    }else{
        System.out.println("Cannot add because "+item.getTitle()+" is already in the store!");
        }
    }
    public Media searchTitle(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
    @Override //redefine the method inside object of java
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no dvd in the store !\n");
        else {
            for (Media item : itemsInStore) {
                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}

