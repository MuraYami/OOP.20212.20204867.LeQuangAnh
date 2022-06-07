package hust.soict.dsai.aims.utils;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class DVDUtils {


    public static String compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String result;
        if (dvd1.getCost() > dvd2.getCost()) {
            result = dvd1.getTitle() + " more expensive than " + dvd2.getTitle();
        }
        else if (dvd1.getCost() == dvd2.getCost() ) {
            result = dvd1.getTitle() + " equal to " + dvd2.getTitle();
        }
        else {
            result = dvd1.getTitle() + " cheaper than " + dvd2.getTitle();
        }
        return result;
    }

    public static String compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String result;
        int i;
        i = dvd1.getTitle().compareTo(dvd2.getTitle());
        if (i > 0) {
            result = dvd1.getTitle() + " > " + dvd2.getTitle();
        }
        else if (i == 0) {
            result = dvd1.getTitle() + " = " + dvd2.getTitle();
        }
        else {
            result = dvd1.getTitle() + " < " + dvd2.getTitle();
        }
        return result;
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc("") ;
        
        tmp.setCategory(dvd1.getCategory());
        tmp.setCost(dvd1.getCost());
        tmp.setDateAdded(dvd1.getDateAdded());
        tmp.setDirector(dvd1.getDirector());
        tmp.setId(dvd1.getId());
        tmp.setLength(dvd1.getLength());
        tmp.setTitle(dvd1.getTitle());      

        dvd1.setCategory(dvd2.getCategory());
        dvd1.setCost(dvd2.getCost());
        dvd1.setDateAdded(dvd2.getDateAdded());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setId(dvd2.getId());
        dvd1.setLength(dvd2.getLength());
        dvd1.setTitle(dvd2.getTitle());      

        dvd2.setCategory(tmp.getCategory());
        dvd2.setCost(tmp.getCost());
        dvd2.setDateAdded(tmp.getDateAdded());
        dvd2.setDirector(tmp.getDirector());
        dvd2.setId(tmp.getId());
        dvd2.setLength(tmp.getLength());
        dvd2.setTitle(tmp.getTitle());

    }

    public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] anOrder) {
        for (int i = 0; i < anOrder.length  ; i++){
            for (int j = i ; j < anOrder.length; j++) {
                if (anOrder[i].getCost() < anOrder[j].getCost() ) {
                    swap(anOrder[i], anOrder[j]);

                }
            }
        }
        return anOrder;
    }

    public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] anOrder) {
        for (int i = 0; i < anOrder.length  ; i++){
            for (int j = i ; j < anOrder.length; j++) {
                if (anOrder[i].getTitle().compareTo(anOrder[j].getTitle()) > 0  ) {
                    swap(anOrder[i], anOrder[j]);
                }
            }
        }
        return anOrder;
    }



    
}
