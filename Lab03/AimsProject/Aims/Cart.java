public class Cart {

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
            System.out.println("Title: " + itemsOdered[i].getTitle());
            System.out.println("Category: " + itemsOdered[i].getCategory());
            System.out.println("Director: " + itemsOdered[i].getDirector());
            System.out.println("Length: " + itemsOdered[i].getLength());
            System.out.println("Cost: " + itemsOdered[i].getCost());
        }
    }

}
