package hust.soict.dsai.aims.media;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private Track tracks[] = new Track[20];	
	private static int nbTracks = 0;
	
	public CompactDisc() { super();}
	public CompactDisc(int id,String title , String category, 
			String director, int length,float cost,
			String artist) {
    	super(id,title, category,director, length, cost); 
    	this.artist = artist;
    	
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		for (int i = 0; i < nbTracks; i++) {
			if (tracks[i] == track) {
				break;
			}
			tracks[nbTracks] = track;
			nbTracks += 1;
		}
		
	}
	public void removeTrack(String title) {
		for (int i = 0; i < nbTracks; i++) {
			if (tracks[i].getTitle() == title) {
				tracks[i] = tracks[nbTracks - 1];
				tracks[nbTracks - 1] = tracks[nbTracks];
                nbTracks -= 1;
                break;				
			}
		}
	}
	
	public int getLength() {
		for (int i = 0; i < nbTracks; i++) {
			length += tracks[i].getLength();
		}
		
		return length;
	}
	
	public void play() {
    	System.out.println("Playing CDs: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    	for (int i = 0; i < nbTracks ; i++) {
    		tracks[i].play();
    	}
    }
	
}