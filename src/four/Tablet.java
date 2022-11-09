package four;

public class Tablet extends Medicine {

    Tablet(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Caution: Store in a cool dry place");
    }
}
