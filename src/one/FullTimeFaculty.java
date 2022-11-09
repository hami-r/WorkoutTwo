package one;

public class FullTimeFaculty extends Faculty{
    private double basic;
    private double allowance;

    public FullTimeFaculty() {
        System.out.print("Enter rate:");
        basic = input.nextDouble();
        System.out.print("Enter hours of work: ");
        allowance = input.nextDouble();
    }

    public double calculateSalary(){
        setSalary(basic + allowance);
        return getSalary();
    }

    public void display() {
        System.out.println("Faculty ID:" + getFacultyId() +"\n" +
                "Salary: " + calculateSalary());
    }

}
