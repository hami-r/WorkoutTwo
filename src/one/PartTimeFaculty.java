package one;

public class PartTimeFaculty extends Faculty{

    private double rate;
    private int hour;

    public PartTimeFaculty() {
        System.out.print("Enter rate:");
        rate = input.nextDouble();
        System.out.print("Enter hours of work: ");
        hour = input.nextInt();
    }

    public double calculateSalary() {
        setSalary(rate * hour);
        return getSalary();
    }

    public void display() {
        System.out.println("Faculty ID:" + getFacultyId() +"\n" +
                "Salary: " + calculateSalary());
    }
}
