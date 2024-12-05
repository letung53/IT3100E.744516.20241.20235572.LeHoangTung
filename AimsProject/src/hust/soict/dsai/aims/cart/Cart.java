package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import hust.soict.dsai.aims.Media.Media;


public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int qtyOrdered; // Number of DVDs currently in the cart

    public void setQtyOrdered(int qty) {
        this.qtyOrdered = qty;
    }

    public void addMedia(Media item){
        if (qtyOrdered<MAX_NUMBERS_ORDERED){
            itemsOrdered.add(item);
            qtyOrdered++;
            System.out.println("Media added to cart");
        } else{
            System.out.println("Cart Full");
        }
    }

    public void addMedia(Media[] itemList){
        if (qtyOrdered + itemList.length < MAX_NUMBERS_ORDERED){
            for (int i = 0; i < itemList.length; i++){
                itemsOrdered.add(itemList[i]);
                
            }
            qtyOrdered = qtyOrdered + itemList.length;
            System.out.println("Discs Added to Cart"); 
        }else{
            System.out.println("Cart Full");
        }
    }
    public void addMedia(Media item1, Media item2){
        if (qtyOrdered + 2 < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(item1);
            itemsOrdered.add(item2);
            qtyOrdered = qtyOrdered + 2;
            System.out.println("Discs Added to Cart"); 
            }
        else {
            System.out.println("Cart Full"); 
        }
    }

    public void removeMedia(Media remItem) {
        if (itemsOrdered.remove(remItem)) { // Removes the item if it exists in the list
            qtyOrdered--; // Decrease the quantity if removal was successful
            System.out.println("Removed Media " + remItem.getTitle() + " from Cart.");
        } else {
            System.out.println("Cannot find Media in Cart.");
        }
    }
    
    
    // Method to calculate the total cost of Medias in the cart
    public String totalCost() {
        float total = 0;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return "" + total;
    }





    // Method to display the list of DVDs in the cart
    public void showCart() {
        System.out.println("***********************CART***********************"); 
        System.out.println("Ordered Items:");
        int i = 1;
        for (Media item : itemsOrdered) {
            if (item != null) {
                System.out.println(i++ + ". DVD - " +item.getTitle() +" - "+ item.getCategory()+" - "+item.getCost());
            }
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***************************************************");
    }
    //method to search by id
    public void searchID(int id) {
        boolean found = false; 
        
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {
                System.out.println("DVD - " + item.getTitle() + " - " + item.getCategory() + " - " + item.getCost());
                found = true; 
                break; 
            }
        }
        if (!found) {
            System.out.println("DVD with ID " + id + " not found.");
        }
    }
    public void searchTitle(String title) {
        boolean found = false; 
        
        for (Media item : itemsOrdered) {
            if (item.getTitle() == title) {
                System.out.println("DVD - " + item.getTitle() + " - " + item.getCategory() + " - " + item.getCost());
                found = true; 
                break; 
            }
        }
        if (!found) {
            System.out.println("DVD with Title " + title + " not found.");
        }
    }
}