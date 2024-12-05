package hust.soict.dsai.aims.Media;

public class DigitalVideoDisc extends Disc implements Playable{
    //instance values
    private String director;
    private int length;
    //getters
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    //constructors
    public DigitalVideoDisc(String title) {
        super(title);
        this.director = "NO GIVEN DIRECTOR";
        this.length = 0;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        this.director = "NO GIVEN DIRECTOR";
        this.length = 0;

    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = 0;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}