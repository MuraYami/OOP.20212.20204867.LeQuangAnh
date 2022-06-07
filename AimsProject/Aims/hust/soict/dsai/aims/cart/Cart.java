package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Random;


public class Cart {

    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOdered = 
                new ArrayList<Media>();
    
    public void addMedia(Media media) {
        if (qtyOrdered < 20 ) {
            itemsOdered.add(media);
            qtyOrdered += 1;
            System.out.println("The media has been added");
        } 
        else {
            System.out.println("The cart is almost full ");
        }
    }


    public void removeMedia(String Title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOdered.get(i).getTitle() == Title) {
                itemsOdered.remove(i);
                qtyOrdered -= 1;
                break;
            }
        }
    }

    public float totalCost() {
        float total = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOdered.get(i).getCost();
        }
        return total;
    }

    public void display() {
        for (int i = 0; i < qtyOrdered; i++) {
            itemsOdered.get(i).display();
        }
        System.out.println("Lucky item: " +getALuckyItem().getTitle());
        System.out.println("Total cost: " + (totalCost() - getALuckyItem().getCost()));
    }
    
    public Media getALuckyItem() {    
    		return itemsOdered.get((int) (Math.random() * qtyOrdered ));
    }
}
