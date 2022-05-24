

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private String dateAdded;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    
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
    public DigitalVideoDisc(String title , String category, String director, int length,float cost ) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title , String category, String director, int length,float cost, String dateAdded, int id ) {
        this(title, category, director, length, cost);
        this.dateAdded = dateAdded;
        this.id = id;
}


///getter
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public String getDateAdded() {
        return dateAdded;
    }
    public int getId() {
        return id;
    }

///setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setCost(float cost) {
        this.cost = cost;        
    }
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
    public void setId(int id) {
        this.id = id;
    }

    ///toSting method
    public String toString() {       
        return title;
    }
}


