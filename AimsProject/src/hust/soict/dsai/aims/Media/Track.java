package hust.soict.dsai.aims.Media;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle(){
        return title;
    }
    public int getLength(){
        return length;
    }
    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        return ((Track)obj).getTitle() == this.getTitle() && ((Track)obj).getLength() == this.getLength();
    }
}
