package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        
        Cart anOrder = new Cart();
        //DigitalVideoDisc dvdList[] = new DigitalVideoDisc[3];

        //Create new dvd objects and add them to the cart 
        DigitalVideoDisc dvd1  = new DigitalVideoDisc("The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
        "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        //anOrder.addDigitalVideoDisc(dvd2,dvd3);
        //dvdList[0] = dvd1;
        //dvdList[1] = dvd2;
        //dvdList[2] = dvd3;
        //anOrder.addDigitalVideoDisc(dvdList);

        //print total cost of the items in cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.sort();

        System.out.println("sort");
        anOrder.removeDigitalVideoDis("Star Wars");
        anOrder.display();

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


