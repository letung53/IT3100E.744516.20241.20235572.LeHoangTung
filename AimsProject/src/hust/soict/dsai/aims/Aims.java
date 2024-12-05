package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.Media.*;
import hust.soict.dsai.aims.store.Store;
import java.util.*;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        
        // Init add media to the store
        initSetup();

        boolean exit = false;
        // CLI
        while (!exit) {
            
            showMenu();

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    exit = true;
                    System.out.println("Good bye!");
                    break;
                case 1:
                    clearConsole();
                    storeMenu(scanner);
                    break;
                case 2:
                    clearConsole();
                    updateStoreMenu(scanner);
                    break;
                case 3:
                    clearConsole();
                    cartMenu(scanner);
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }

        }

    }
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    // store setup 
    public static void initSetup() {

        // Adding more DVDs
DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 15.50f);     
DigitalVideoDisc dvd2 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 10.99f); 
DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 12.75f);
DigitalVideoDisc dvd4 = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 18.00f);
DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 20.00f);
DigitalVideoDisc dvd6 = new DigitalVideoDisc("Parasite", "Thriller", "Bong Joon Ho", 132, 14.95f);
DigitalVideoDisc dvd7 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony and Joe Russo", 181, 19.99f);
DigitalVideoDisc dvd8 = new DigitalVideoDisc("Coco", "Animation", "Lee Unkrich", 105, 12.00f);
DigitalVideoDisc dvd9 = new DigitalVideoDisc("Joker", "Drama", "Todd Phillips", 122, 16.50f);
DigitalVideoDisc dvd10 = new DigitalVideoDisc("Tenet", "Action", "Christopher Nolan", 150, 22.00f);

store.addMedia(dvd1);
store.addMedia(dvd2);
store.addMedia(dvd3);
store.addMedia(dvd4);
store.addMedia(dvd5);
store.addMedia(dvd6);
store.addMedia(dvd7);
store.addMedia(dvd8);
store.addMedia(dvd9);
store.addMedia(dvd10);

// Adding more Books
Book book1 = new Book("To Kill a Mockingbird", "Fiction", 18.99f);
Book book2 = new Book("1984", "Dystopian", 22.50f);
Book book3 = new Book("Sapiens: A Brief History of Humankind", "Non-Fiction", 25.00f);
Book book4 = new Book("The Hobbit", "Fantasy", 15.75f);
Book book5 = new Book("Becoming", "Biography", 30.00f);
Book book6 = new Book("The Catcher in the Rye", "Classic", 18.00f);
Book book7 = new Book("The Great Gatsby", "Classic", 20.00f);
Book book8 = new Book("Educated", "Memoir", 22.95f);
Book book9 = new Book("Pride and Prejudice", "Romance", 12.99f);
Book book10 = new Book("Dune", "Science Fiction", 28.50f);

store.addMedia(book1);
store.addMedia(book2);
store.addMedia(book3);
store.addMedia(book4);
store.addMedia(book5);
store.addMedia(book6);
store.addMedia(book7);
store.addMedia(book8);
store.addMedia(book9);
store.addMedia(book10);

// Adding more Compact Discs
CompactDisc cd1 = new CompactDisc("Abbey Road", "Music", "The Beatles", 1200.75f);
Track track1CD1 = new Track("Come Together", 259);
Track track2CD1 = new Track("Something", 182);
Track track3CD1 = new Track("Here Comes The Sun", 185);
cd1.addTrack(track1CD1);
cd1.addTrack(track2CD1);
cd1.addTrack(track3CD1);

CompactDisc cd2 = new CompactDisc("Folklore", "Music", "Taylor Swift", 1100.99f);
Track track1CD2 = new Track("The 1", 210);
Track track2CD2 = new Track("Exile", 260);
Track track3CD2 = new Track("Cardigan", 240);
cd2.addTrack(track1CD2);
cd2.addTrack(track2CD2);
cd2.addTrack(track3CD2);

CompactDisc cd3 = new CompactDisc("Random Access Memories", "Music", "Daft Punk", 1350.00f);
Track track1CD3 = new Track("Get Lucky", 370);
Track track2CD3 = new Track("Instant Crush", 337);
Track track3CD3 = new Track("Lose Yourself to Dance", 348);
cd3.addTrack(track1CD3);
cd3.addTrack(track2CD3);
cd3.addTrack(track3CD3);

CompactDisc cd4 = new CompactDisc("Rumors", "Music", "Fleetwood Mac", 1500.45f);
Track track1CD4 = new Track("Dreams", 275);
Track track2CD4 = new Track("The Chain", 280);
Track track3CD4 = new Track("Go Your Own Way", 230);
cd4.addTrack(track1CD4);
cd4.addTrack(track2CD4);
cd4.addTrack(track3CD4);

CompactDisc cd5 = new CompactDisc("Thriller", "Music", "Michael Jackson", 1550.00f);
Track track1CD5 = new Track("Wanna Be Startin' Somethin'", 362);
Track track2CD5 = new Track("Thriller", 358);
Track track3CD5 = new Track("Beat It", 258);
cd5.addTrack(track1CD5);
cd5.addTrack(track2CD5);
cd5.addTrack(track3CD5);

store.addMedia(cd1);
store.addMedia(cd2);
store.addMedia(cd3);
store.addMedia(cd4);
store.addMedia(cd5);

clearConsole();

    }
    
    // Print method
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            store.toString();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    boolean foundDetails = false;
                    while (!foundDetails) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchTitle(title);
                        if (media != null) {
                            clearConsole();
                            System.out.println("Details: ");
                            System.out.println(media);
                            mediaDetailsMenu(scanner, media);
                            foundDetails = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                case 2:
                    boolean foundToAdd = false;
                    while (!foundToAdd) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchTitle(title);
                        if (media != null) {
                            cart.addMedia(media);
                            foundToAdd = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                case 3:
                    boolean foundToPlay = false;
                    while (!foundToPlay) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchTitle(title);
                        if (media != null) {
                            if (media instanceof Disc || media instanceof CompactDisc) {
                                media.play();
                            } else {
                                System.out.println("This type of media is not supported!");
                            }
                            foundToPlay = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                case 4:
                    clearConsole(); 
                    cartMenu(scanner);
                    break;    
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    public static void mediaDetailsMenu(Scanner scanner, Media media) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole(); 
                    back = true;
                    break;
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof Disc || media instanceof CompactDisc) {
                        media.play();
                    } else {
                        System.out.println("This type of media is not supported!");
                    }
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    public static void cartMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            cart.toString();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole(); 
                    back = true;
                    break;
                case 1:
                    System.out.println("Filter medias in cart by (1) id or (2) title:");
                    int filterOption = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    while (!found) {
                        if (filterOption == 1) {
                            System.out.println("Enter the id to filter (type 0 to stop):");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            if (id == 0) {
                                clearConsole();
                                break;
                            }
                            cart.searchID(id);
                            found = true;
                        } else if (filterOption == 2) {
                            System.out.println("Enter the title to filter (type 0 to stop):");
                            String title = scanner.nextLine();
                            if (title.equals("0")) {
                                clearConsole();
                                break;
                            }
                            cart.searchTitle(title);
                            found = true;
                        } else if (filterOption == 0) {
                            clearConsole();
                            break;
                        } else {
                            System.out.println("Invalid option.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Sort medias in cart by (1) title or (2) cost:");
                    int sortOption = scanner.nextInt();
                    scanner.nextLine();
                    if (sortOption == 1) {
                        cart.sortMediaByTitle();
                    } else if (sortOption == 2) {
                        cart.sortMediaByCost();
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                case 3:
                    boolean foundToRemove = false;
                    while (!foundToRemove) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = cart.removebyTitle(title);
                        if (media != null) {
                            clearConsole();
                            cart.removeMedia(media);
                            foundToRemove = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    } 
                    break;
                case 4:
                    boolean foundToPlay = false;
                    while (!foundToPlay) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchTitle(title);
                        if (media != null) {
                            if (media instanceof Disc || media instanceof CompactDisc) {
                                media.play();
                            } else {
                                System.out.println("This type of media is not supported!");
                            }
                            foundToPlay = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break; 
                case 5:
                    clearConsole();
                    cart.empty();
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    public static void updateStoreMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media");
            System.out.println("2. Remove a media");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    System.out.println("Enter the category of the media (1) Book, (2) CD, (3) DVD or (0) exit:");
                    int categoryChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (categoryChoice == 1) {
                        System.out.println("Enter book title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.println("Enter book category: ");
                        String bookCategory = scanner.nextLine();
                        System.out.println("Enter book cost: ");
                        Float bookCost = scanner.nextFloat();
                        scanner.nextLine();

                        Book newBook = new Book(bookTitle, bookCategory, bookCost);
                        store.addMedia(newBook);
                    } else if (categoryChoice == 2) {
                        System.out.println("Enter CD title: ");
                        String cdTitle = scanner.nextLine();
                        System.out.println("Enter CD category: ");
                        String cdCategory = scanner.nextLine();
                        System.out.println("Enter CD artist: ");
                        String cdArtist = scanner.nextLine();
                        System.out.println("Enter CD cost: ");
                        Float cdCost = scanner.nextFloat();
                        scanner.nextLine();

                        CompactDisc newCD = new CompactDisc(cdTitle, cdCategory, cdArtist, cdCost);

                        
                        System.out.println("Do you want to add tracks to your CD? (1) Yes (0) No:");
                        int addTrack = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (addTrack == 1) {
                            System.out.println("How many tracks in your CD?");
                            int numTrack = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < numTrack; i++) {
                                System.out.println("Your " + (i+1) + " track: ");
                                System.out.println("Enter track title: ");
                                String trackTitle = scanner.nextLine();
                                System.out.println("Enter track length: ");
                                int trackLength = scanner.nextInt();
                                scanner.nextLine();

                                Track newTrack = new Track(trackTitle, trackLength);
                                newCD.addTrack(newTrack);
                            }
                            store.addMedia(newCD);
                        } else if (addTrack == 0) {
                            store.addMedia(newCD);
                        }
                    } else if (categoryChoice == 3) {
                        System.out.println("Enter DVD title: ");
                        String dvdTitle = scanner.nextLine();
                        System.out.println("Enter DVD category: ");
                        String dvdCategory = scanner.nextLine();
                        System.out.println("Enter book cost: ");
                        Float dvdCost = scanner.nextFloat();
                        scanner.nextLine();
                        
                        DigitalVideoDisc newDVD = new DigitalVideoDisc(dvdTitle, dvdCategory, dvdCost);
                        store.addMedia(newDVD);                
                    } else if (categoryChoice == 0) {
                        clearConsole();
                        break;
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                case 2:
                    boolean foundToRemove = false;
                    while (!foundToRemove) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String titleForRemove = scanner.nextLine();
                        if (titleForRemove.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchTitle(titleForRemove);
                        if (media != null) {
                            clearConsole();
                            store.removeMedia(media);
                            foundToRemove = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
}
        