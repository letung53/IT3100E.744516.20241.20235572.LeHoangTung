package hust.soict.dsai.aims.Media;
import java.util.List;
import java.util.ArrayList;

public class Book extends Media{

    private List<String> authors = new ArrayList<String>();
    //getters
    public void getAuthors() {
        for (int i = 0; i < authors.size(); i++){
            System.out.println(authors.get(i) +"\n");
        };
    }
    //constructors
    public Book(String title) {
        super(title);
        this.authors = new ArrayList<String> ();
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
        this.authors = new ArrayList<String> ();
    }
    public Book(String title, String category, List<String> authors, float cost) {
        super(title, category, cost);
        this.authors = new ArrayList<String> (authors);
    }
    //methods
    public boolean checkAuthor(String authorname){
        return (authors.contains(authorname));
    }
    public void addAuthor(String authorname){
        if (!checkAuthor(authorname)){
            authors.add(authorname);
            System.out.println("Author "+ authorname+" is added.");
        }
        else{
            System.out.println("CANNOT ADD AUTHOR");
        }
    }
    public void removeAuthor(String authorname){
        if (checkAuthor(authorname)){
            authors.remove(authorname);
            System.out.println("Author "+ authorname+" is removed");
        }
        else{
            System.out.println("No author named "+authorname+" is in the list.");
        }
    }
}