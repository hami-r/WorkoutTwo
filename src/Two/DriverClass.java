package Two;

public class DriverClass {
    public static void main(String[] args) {
        TwoBHK flats[] = new TwoBHK[3];
        flats[0] = new TwoBHK(200,102, 200,2200);
        flats[1] = new TwoBHK();
        flats[2] = new TwoBHK(100,300, 140, 2350);
        double totalAmount = 0;
        for (int i = 0; i < flats.length; i++) {
            flats[i].show();
            totalAmount += flats[i].price;
        }
        System.out.println("\nNumber of flats :" + TwoBHK.count + "\n" +
                "Total amount = Rs." + totalAmount);
    }
}
