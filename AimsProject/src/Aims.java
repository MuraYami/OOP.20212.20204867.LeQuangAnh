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
        //anOrder.removeDigitalVideoDis("Star Wars");
        anOrder.display();

    }
}
