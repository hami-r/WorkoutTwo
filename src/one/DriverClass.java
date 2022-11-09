package one;

public class DriverClass {
    public static void main(String[] args) {

        PartTimeFaculty partTimeOne = new PartTimeFaculty();
        partTimeOne.display();
        PartTimeFaculty partTimeTwo = new PartTimeFaculty();
        partTimeTwo.display();

        FullTimeFaculty fullTimeOne = new FullTimeFaculty();
        fullTimeOne.display();
        FullTimeFaculty fullTimeTwo = new FullTimeFaculty();
        fullTimeTwo.display();
    }
}