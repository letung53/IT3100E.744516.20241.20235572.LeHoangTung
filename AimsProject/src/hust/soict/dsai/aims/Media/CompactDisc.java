package hust.soict.dsai.aims.Media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
        //instance values
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    private int totalLength;

    public String getArtist(){
        return artist;
    }
    public CompactDisc(String title){
        super(title);
    }
    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }
    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
            System.out.println("ADD TRACK SUCCESSFUL");
        }
        else{
            System.out.println("CANNOT ADD TRACK");
        }
    }
    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
        }
        else{
            System.out.println("CANNOT REMOVE TRACK");
        }
    }
    public void getCDLength(){
        totalLength = 0;
        for (Track tr : tracks){
            totalLength = totalLength + tr.getLength(); 
        }
        System.out.println("CD length: "+totalLength+ " minutes.");;
    }
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        getCDLength();
        System.out.println("Artist: " + getArtist());
        for (Track tr : tracks){
            tr.play(); 
        }
    }
    @Override
    public String toString() {
        return this.getId() + " - CD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Artist" + this.getArtist() +
                " - Length: " + this.getLength() + " seconds" + 
                " - Cost: " + this.getCost() + "$";
    }
}