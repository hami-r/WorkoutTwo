package six;

public class DriverClass {
    public static void main(String[] args) {

        Employee emp = new Employee("John");
        int x = emp.totalAssessment();
        emp.percentage(x);
        emp.display();
        emp.promotion();

    }
}
