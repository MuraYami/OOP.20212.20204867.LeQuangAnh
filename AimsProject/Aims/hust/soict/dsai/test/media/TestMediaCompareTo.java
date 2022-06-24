package hust.soict.dsai.test.media;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.*;

public class TestMediaCompareTo{
	public static void main(String[] args) {
		ArrayList<Media> collection = new ArrayList<Media>(20);
		DigitalVideoDisc dvd1  = new DigitalVideoDisc(1, "The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);       
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
        "Animation", 18.99f);
        collection.add(dvd2);
        collection.add(dvd1);
        collection.add(dvd3);
        
        java.util.Iterator<Media> iterator = collection.iterator();
        System.out.println("------------------------------");
        System.out.println("the dvds currently in the order are: ");
        
        while  (iterator.hasNext() ) {
        	System.out.println(((Media)iterator.next()).getTitle());
        }
        
        java.util.Collections.sort((java.util.List)collection);
        iterator = collection.iterator();
        
        System.out.println("-------------------------------------");
        System.out.println("the dvds in sorted order are: ");
        
        while (iterator.hasNext()) {
        	System.out.println(((Media)iterator.next()).getTitle());
        }
        
        System.out.println("-----------------------");
        
        java.util.Collections.sort(collection, Media.COMPARE_BY_TITLE_COST);
        
        iterator = collection.iterator();
        while (iterator.hasNext()) {
        	((Media)iterator.next()).display();
        }
        
        System.out.println("----------------------------");
        
java.util.Collections.sort(collection, Media.COMPARE_BY_COST_TITLE);
        
        iterator = collection.iterator();
        while (iterator.hasNext()) {
        	((Media)iterator.next()).display();
        }
        
        System.out.println("----------------------------");
	}
}