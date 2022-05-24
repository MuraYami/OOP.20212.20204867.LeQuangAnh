package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[20];
	private static int nbDVD = 0;
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore[nbDVD] = dvd;
		nbDVD += 1;
	}
		
	 public void removeDVD(String title) {
	        for (int i = 0; i < nbDVD; i++) {
	            if (itemsInStore[i].getTitle() == title) {
	                for (int j = i; j <= nbDVD; j++) {
	                    itemsInStore[j] = itemsInStore[j + 1];
	                }
	                nbDVD -= 1;
	                break;
	            }
	        }
	    }
	
}
