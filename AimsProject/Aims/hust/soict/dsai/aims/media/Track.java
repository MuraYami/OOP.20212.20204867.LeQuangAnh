package hust.soict.dsai.aims.media;

public class Track implements Playable, Comparable<Track>{
	private String title ;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public Track() {}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public void play() {
    	System.out.println("Playing track: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    }
	
	public boolean equals(Track track) {
		if (this.title == track.title & this.length == track.length) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Track track) {
		return this.title.compareTo(track.title);
	}
}