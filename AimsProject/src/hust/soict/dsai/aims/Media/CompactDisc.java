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
    public CompactDisc(String title, String artist){
        super(title);
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
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        getCDLength();
        System.out.println("Artist: " + getArtist());
        for (Track tr : tracks){
            tr.play(); 
        }
    }
}