package hust.soict.dsai.aims.Media;


public class Media {
    //class values
    private static int nbMedia = 0;
    //instance values
    private int id;
    private String title;
    private String category;
    private float cost;
    //getters and setters
    public float getCost() {
        return cost;
       }
    public int getId(){
        return id;
    }  
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;   
    }
    public void setTitle(String title){
        this.title = title;
    }
    //constructors
    public Media(String title) {
        nbMedia++;
        this.title= title;
        this.category = "NOT CATEGORIZED";
        this.cost = 0;
        this.id = nbMedia;
        
    }
    public Media(String title, String category, float cost) {
        nbMedia++;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbMedia;
    }
    @Override //redefine the method inside object of java
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append(this.getTitle() + " - " + this.getCost());
        return string.toString();
    }
}


