package four;

public class Syrup extends Medicine{

    public Syrup(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Caution: Shake well before use.");
    }
}
