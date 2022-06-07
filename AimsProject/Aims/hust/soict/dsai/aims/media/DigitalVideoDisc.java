package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Disc implements Playable{
    //private String title;
    //private String category;
    //private String director;
    //private int length;
    //private float cost;
    //private String dateAdded;
    //private int id;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc() { super() ;}
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(int id,String title , String category, String director, int length,float cost ) {
    	super(id,title, category,director, length, cost);        
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(int id, String title , String category, String director, int length,float cost, String dateAdded) {
        this(id, title, category, director, length, cost);
        this.dateAdded = dateAdded;
}
    
    public void display() {
    	System.out.println("title :" + title + 
    			" - category :" + category + 
    			" - director :" + director + 
    			" - length :" + length + 
    			" - cost :" + cost);
    	
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public void setLength(int length) {
        this.length = length;
    }


    ///toSting method
    public String toString() {       
        return title;
    }
    
    ///boolean 
    public boolean isMatch(String title) {
    	if (this.title.indexOf(title) >= 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    }
}


