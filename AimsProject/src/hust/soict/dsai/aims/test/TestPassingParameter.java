package hust.soict.dsai.aims.test;
         
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }


    public static void changeTitle(DigitalVideoDisc dvd,String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    //real swap method for two objects, this time we swaps all the values of the two objects
    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2){
        String titleTmp = o1.getTitle();
        changeTitle(o1, o2.getTitle());
        changeTitle(o2, titleTmp);
    }
    
}

//swap method given in the lab03 instruction (cannot use)
//    public static void swap(Object o1, Object o2){
//        Object tmp = o1;
//        o1 = o2;
//        o2 = tmp;}