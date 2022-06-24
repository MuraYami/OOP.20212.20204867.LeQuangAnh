package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {}
	
	public Book(int id, String title, 
			String category,float cost, String dateAdded ) {
		super(id, title, category, cost);
	}
		
		
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

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void addAuthor(String author) {
		if (authors.indexOf(author) == -1) {
			authors.add(author);
		}
	}
	
	public void removeAuthor(String author) {
		if (authors.indexOf(author) != -1) {
			authors.remove(author);
		}
	}
	public void display() {
		System.out.println("title :" + title + " - category :" + category + 
				" - author list :" + authors + " - cost :" + cost);
	}

}