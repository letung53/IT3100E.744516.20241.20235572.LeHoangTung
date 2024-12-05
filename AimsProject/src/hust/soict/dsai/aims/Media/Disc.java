package hust.soict.dsai.aims.Media;

public class Disc extends Media {
    //instance values
    private int length;
    private String director;

    //getter methods
    public int getLength(){
        return length;
    }
    public String getDirector(){
        return director;
    }
    //constructors
    public Disc(String title) {
        super(title);
        this.director = "NO GIVEN DIRECTOR";
        this.length = 0;
    }
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
        this.director = "NO GIVEN DIRECTOR";
        this.length = 0;

    }
    public Disc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = 0;
    }
    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
}
