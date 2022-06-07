package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected int length;
	protected String director;
	
	public Disc() {super();}
	
	public Disc(int id,String title , String category, String director, int length,float cost ) {
    	super(id,title, category, cost);
        this.director = director;
        this.length = length;
	}
	
	public int getLength( ) { return length;}
	public String getDirector() {return director;}
	
}