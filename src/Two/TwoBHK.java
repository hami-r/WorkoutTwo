package Two;

public class TwoBHK extends OneBHK{
    double room2Area;

    TwoBHK() {
        room2Area = 200;
    }

    TwoBHK(double roomArea,double room2Area, double hallArea, double price) {
        this.roomArea = roomArea;
        this.room2Area = room2Area;
        this.hallArea = hallArea;
        this.price = price;

    }

    @Override
    public void show() {
        System.out.println("Two BHK flat: \n" +
                "First room area is " + roomArea +"sq m.\n" +
                "Second room area is "+ room2Area + "sq m.\n" +
                "Hall area is " + hallArea + "sq m.\n" +
                "and Price is Rs." + price + "\n");
    }
}
