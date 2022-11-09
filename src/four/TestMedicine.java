package four;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args) {
        int noOfMedicine = 0;
        Random random = new Random();
        Medicine drugs[] = new Medicine[3];
        drugs[0] = new Tablet("tablet", "New Delhi");
        drugs[1] = new Syrup("syrup", "Kochi");
        drugs[2] = new Oilment("oilment", "Dubai");
        for (noOfMedicine = 0; noOfMedicine < 3; noOfMedicine++) {
            int typeOfMedicine = random.nextInt(3);
            drugs[typeOfMedicine].displayLabel();
        }

    }
}
