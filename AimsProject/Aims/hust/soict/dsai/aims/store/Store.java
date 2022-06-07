package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;


public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private static int nbDVD = 0;
	
	public void addMedia(Media media) {
		itemsInStore.add(media);
		nbDVD += 1;
	}
		
	 public void removeMedia(String title) {
	        for (int i = 0; i < nbDVD; i++) {
	            if (itemsInStore.get(i).getTitle() == title) {
	                itemsInStore.remove(i);
	                nbDVD -= 1;
	                break;
	            }
	        }
	    }
	
}
