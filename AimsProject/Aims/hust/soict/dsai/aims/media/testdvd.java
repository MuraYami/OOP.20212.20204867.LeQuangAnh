package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.utils.DVDUtils;

public class testdvd{
	 public static void main(String[] args) {
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"AAAA", "aaaa","aaaa", 1, 5.6f );
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "BBBB", "bbbb","bbbb", 2, 5.3f );
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "CCCC", "aaaa","aaaa", 3, 5f );
	        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "DDDD", "aaaa","aaaa", 4, 7.1f );
	        DigitalVideoDisc dvd5 = new DigitalVideoDisc(5, "EEEE", "aaaa","aaaa", 5, 3.3f );


	        System.out.println(DVDUtils.compareByCost(dvd1, dvd2));
	        System.out.println(DVDUtils.compareByTitle(dvd5, dvd3));

	        DigitalVideoDisc[] sorted = DVDUtils.sortByCost(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
	        System.out.println("sort by cost: ");
	        for (int i = 0; i < sorted.length; i++) {
	            System.out.println(sorted[i].toString());
	        }

	        sorted = DVDUtils.sortByTitle(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
	        System.out.println("sort by title: ");
	        for (int i = 0; i < sorted.length; i++) {
	            System.out.println(sorted[i].toString());
	        }        
	          
	    }
}