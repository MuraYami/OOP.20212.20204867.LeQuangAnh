package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart1 {

    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOdered[] = 
                new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20 ) {
            itemsOdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        } 
        else {
            System.out.println("The cart is almost full ");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        qtyOrdered = 0;
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered < 20 ) {
                itemsOdered[qtyOrdered] = dvdList[i];
                qtyOrdered += 1;
                System.out.println(i);
                System.out.println("The disc has been added");
            } 
            else {
                System.out.println("The cart is almost full ");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < 19) {
            itemsOdered[qtyOrdered] = dvd1;
            itemsOdered[qtyOrdered + 1] = dvd2;
            qtyOrdered += 2;
            System.out.println("Two disc has been added");
        }
        else {
            System.out.println("The cart is almost full ");
        }
    }

    public void removeDigitalVideoDis(String Title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOdered[i].getTitle() == Title) {
                for (int j = i; j <= qtyOrdered; j++) {
                    itemsOdered[j] = itemsOdered[j + 1];
                }
                qtyOrdered -= 1;
                break;
            }
        }
    }

    public float totalCost() {
        float total = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOdered[i].getCost();
        }
        return total;
    }

    public void display() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(
            "DVD - " + itemsOdered[i].getTitle() + " - " + 
            itemsOdered[i].getCategory() + " - " + 
            itemsOdered[i].getDirector() + " - " + 
            itemsOdered[i].getLength() + ": " + 
            itemsOdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
    }

    public void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc("") ;
        
        tmp.setCategory(dvd1.getCategory());
        tmp.setCost(dvd1.getCost());
        tmp.setDateAdded(dvd1.getDateAdded());
        tmp.setDirector(dvd1.getDirector());
        tmp.setId(dvd1.getId());
        tmp.setLength(dvd1.getLength());
        tmp.setTitle(dvd1.getTitle());      

        dvd1.setCategory(dvd2.getCategory());
        dvd1.setCost(dvd2.getCost());
        dvd1.setDateAdded(dvd2.getDateAdded());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setId(dvd2.getId());
        dvd1.setLength(dvd2.getLength());
        dvd1.setTitle(dvd2.getTitle());      

        dvd2.setCategory(tmp.getCategory());
        dvd2.setCost(tmp.getCost());
        dvd2.setDateAdded(tmp.getDateAdded());
        dvd2.setDirector(tmp.getDirector());
        dvd2.setId(tmp.getId());
        dvd2.setLength(tmp.getLength());
        dvd2.setTitle(tmp.getTitle());

    }

    public  DigitalVideoDisc[] sort() {
        for (int i = 0; i < qtyOrdered  ; i++){
            for (int j = i ; j < qtyOrdered; j++) {
                if (itemsOdered[i].getTitle().compareTo(itemsOdered[j].getTitle()) > 0 ) {
                    swap(itemsOdered[i], itemsOdered[j]);
                }
                else if (itemsOdered[i].getTitle().compareTo(itemsOdered[j].getTitle()) == 0 ) {
                    if (itemsOdered[i].getCost() < itemsOdered[j].getCost()) {  
                        swap(itemsOdered[i], itemsOdered[j]);
                    }
                    else if (itemsOdered[i].getCost() == itemsOdered[j].getCost()) {
                        if (itemsOdered[i].getLength() < itemsOdered[j].getLength()) { 
                            swap(itemsOdered[i], itemsOdered[j]);
                        } 
                    }
                }
                }
            }
    
        return itemsOdered;
    }

}
