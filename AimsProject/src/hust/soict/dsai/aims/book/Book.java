package hust.soict.dsai.aims.book;

public class Book {
        //class values
    private static int nbBooks = 0;
        //instance values
    private String title;
    private String category;
    private String[] authors;
    private float cost;
    private int id ;
    
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public void getAuthors() {
        for (int i = 0; i < authors.length; i++){
            System.out.println(authors[i] +"\n");
        };
    }
    public float getCost() {
        return cost;
       }
    public int getId(){
        return id;
    }   
    public Book(String title) {
        nbBooks++;
        this.title = title;
        this.authors = new String[] {};
        this.category = "NOT CATEGORIZED";
        this.cost = 0;
        this.id = nbBooks;
    }
    public Book(String title, String category, float cost) {
        nbBooks++;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = new String[] {};
        this.id = nbBooks;
    }
    public Book(String title, String category, String[] authors, float cost) {
        nbBooks++;
        this.title = title;
        this.category = category;
        this.authors = authors;
        this.cost = cost;
        this.id = nbBooks;
    }
    public boolean checkAuthor(Book book){
        if (book.authors == null || book.authors.length == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void addAuthor(Book book, String author){
        if (checkAuthor(book)){
            book.authors[0] = author;
            System.out.println("Author "+ author+" is added");
        }
        else{
            System.out.println("CANNOT ADD AUTHOR");
        }
    }
}