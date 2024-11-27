

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Maximum of 20 DVDs in one cart
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // Array to store DVDs
    private int qtyOrdered; // Number of DVDs currently in the cart

    public void setQtyOrdered(int qty) {
        this.qtyOrdered = qty;
    }

    // Method to add a DVD to the cart (lab02)
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Disc Added to Cart"); 
        } else {
            System.out.println("Cart Full"); 
        }
    }
    //method overloading of addDigitalVideoDisc by differing types of parameters (2.1 lab03)
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if (qtyOrdered + dvdList.length < MAX_NUMBERS_ORDERED) {
            for (int i=0; i < dvdList.length; i++){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            }
            System.out.println("Discs Added to Cart"); 
        } else {
            System.out.println("Cart Full"); 
        }
    }
    //method overloading of addDigitalVideoDisc by differing number of parameters (2.2 lab03)
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            itemsOrdered[qtyOrdered+1] = dvd2;
            qtyOrdered = qtyOrdered + 2;
            System.out.println("Discs Added to Cart"); 
            }
        else {
            System.out.println("Cart Full"); 
        }
    }
    // Method to remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                System.out.println("Removed DVD " + disc.getTitle() + " from Cart."); 
                // Shift remaining items left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--; 
                itemsOrdered[qtyOrdered] = null; 
                return;
            }
        }
        System.out.println("Cannot find disc in Cart"); 
    }

    // Method to calculate the total cost of DVDs in the cart
    public String totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return "" + total;
    }

    // Method to display the list of DVDs in the cart
    public void showCart() {
        System.out.println("***********************CART***********************"); 
        System.out.println("Ordered Items:");
        int i = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                System.out.println(i++ + ". DVD - " +disc.getTitle() +" - "+ disc.getCategory()+" - "+ disc.getDirector()+" - "+ disc.getLength() + " - "+disc.getCost());
            }
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***************************************************");
    }
    //method to search by id
    public void searchID(int id) {
        boolean found = false; 
        
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - "  + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
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
        
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle() == title) {
                System.out.println("DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - "  + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
                found = true; 
                break; 
            }
        }
        if (!found) {
            System.out.println("DVD with Title " + title + " not found.");
        }
    }
}