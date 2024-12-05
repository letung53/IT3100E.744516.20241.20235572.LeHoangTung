package hust.soict.dsai.aims;

import hust.soict.dsai.aims.Media.Book;
import hust.soict.dsai.aims.Media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.Media.CompactDisc;
import hust.soict.dsai.aims.Media.Track;
import hust.soict.dsai.aims.Media.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hust.soict.dsai.aims.store.Store;              
import hust.soict.dsai.aims.test.TestPassingParameter;  
public class Aims {

    public static void main(String[] args) {
        //Create a new cart
        Cart anOrder = new Cart();
        anOrder.setQtyOrdered(0); 

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 
        "Roger Allers",87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
        "George Lucas",87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);

        System.out.println(anOrder.totalCost());
        
        System.out.println("\nTesting removeDigitalVideoDisc method");
        anOrder.removeMedia(dvd2);
        anOrder.removeMedia(dvd2);
        anOrder.showCart();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers", "Science Fiction","Joss Whedon", 99999.99f);
        anOrder.addMedia(dvd4);
        anOrder.showCart();
        anOrder.searchID(1);
        anOrder.searchTitle("The Lion Kidfng");

        Book book3 = new Book("Learning Java", "Programming", Arrays.asList("Author1", "Author2"), 49.99f);

        book3.addAuthor("HHIHIHIHI");
        book3.addAuthor("Author1");
        book3.addAuthor("Author1");

        Track track1 = new Track("Hihi", 2);
        Track track2 = new Track("Hifhi", 5);
        Track track3 = new Track("dfd", 19);
        CompactDisc CD1 = new CompactDisc("Title", "Artist");
        CD1.addTrack(track1);
        CD1.addTrack(track2);
        CD1.addTrack(track3);
        CD1.getCDLength();
        CD1.play();
        List<Media> mediae = new ArrayList<Media>();
        mediae.add(dvd1);
        mediae.add(dvd2);
        mediae.add(book3);
        for (Media m : mediae){
            System.out.println(m.toString());
        }
    }
}