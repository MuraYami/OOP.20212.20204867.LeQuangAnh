package hust.soict.dsai.aims.media;

public abstract class Media {
	
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