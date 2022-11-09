package Two;

public class OneBHK {
    static int count;
    double roomArea;
    double hallArea;
    double price;

    OneBHK() {
        count++;
        roomArea = 200;
        hallArea = 100;
        price = 2000;
    }

    OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    public void show() {
        System.out.println("One BHK flat: \n" +
                "Room area is " + roomArea +"sq m.\n" +
                "Hall area is " + hallArea + "sq m.\n" +
                "and Price is Rs." + price);
    }

}
