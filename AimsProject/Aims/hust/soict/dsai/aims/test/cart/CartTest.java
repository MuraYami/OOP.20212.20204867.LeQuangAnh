package hust.soict.dsai.aims.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.manager.*;

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();

        //Create new dvd objects and add them to the cart 
        DigitalVideoDisc dvd1  = new DigitalVideoDisc(1, "The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
        "Animation", 18.99f);
        cart.addMedia(dvd3);
        
        //Test the print(display) method
        cart.display();
        new MediaStore(dvd3);
        
        //To-do: TEst the search methods here
        
        
    }
    
}
