package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media>{
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	protected String dateAdded;
	
	public Media() {}
	
	public Media(int id, String title, String category, float cost) {
		this.category = category;
		this.id = id ;
		this.title = title;
		this.cost = cost;
	}
	
	public void display() {}
	
	public boolean equals(Media media) {
		if (this.id == media.id ) {
			return true;
		} else {
			return false;}
	}
	
	public int compareTo(Media media) {
		if (this.title.compareTo(media.title) == 0) {
			return this.category.compareTo(media.category);
		} else {
			return this.title.compareTo(media.title);
		}
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
			Comparator.comparing(Media::getTitle).thenComparing(Media::getCost);
	
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
			Comparator.comparing(Media::getCost).thenComparing(Media::getTitle);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String date) {
		this.dateAdded = date;
	}	
	
}

interface Playable{
	public void play();
}