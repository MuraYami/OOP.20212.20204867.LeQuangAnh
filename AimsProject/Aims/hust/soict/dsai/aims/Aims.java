package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        showMenu();
        storeMenu();
        cartMenu();

    }
    
    public static void showMenu( ) {
    	System.out.println("AIMS: ");
    	System.out.println("_______________________");
    	System.out.println("1. View store");
    	System.out.println("2.Update store");
    	System.out.println("3. See current cart");
    	System.out.println("0. Exit");
    	System.out.println("_______________________");
    	System.out.println("Please choose a number: 0-1-2-3");  	
    }
    
    public static void storeMenu() {
    	System.out.println("Options: ");
    	System.out.println("_______________________");
    	System.out.println("1. See a DVD's details");
    	System.out.println("2. Add a DVD to cart");
    	System.out.println("3. See currnt cart");
    	System.out.println("). Back");
    	System.out.println("_______________________");
    	System.out.println("Please choose a number: 0-1-2-3");
    	
    }
    
    public static void cartMenu() {
    	System.out.println("Options: ");
    	System.out.println("_______________________");
    	System.out.println("1. Filter DVDs in cart");
    	System.out.println("2.Sort DVDs in cart");
    	System.out.println("3. Remove DVD from cart");
    	System.out.println("4. Place order");
    	System.out.println("0. Back");
    	System.out.println("_______________________");
    	System.out.println("Please choose a number: 0-1-2-3-4");
    }    
}


