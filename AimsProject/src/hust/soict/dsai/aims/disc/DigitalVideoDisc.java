package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    //class values
    private static int nbDigitalVideoDiscs = 0;
    //instance values
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id ;

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public int getId(){
        return id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    
    public DigitalVideoDisc(String title) {
        nbDigitalVideoDiscs++;
        this.title = title;
        this.director = "NO GIVEN DIRECTOR";
        this.length = 0;
        this.category = "NOT CATEGORIZED";
        this.cost = 0;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        nbDigitalVideoDiscs++;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = "NO GIVEN DIRECTOR";
        this.length = 0;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        nbDigitalVideoDiscs++;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.length = 0;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
    }
}