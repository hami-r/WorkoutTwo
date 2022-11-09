package four;

public class Oilment extends Medicine{

    public Oilment(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Caution: For external use only.");
    }
}
