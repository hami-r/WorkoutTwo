package one;

import java.util.Scanner;

public class Faculty {

    Scanner input = new Scanner(System.in);
    private  static int facultyId;
    private double salary;

    public Faculty() {
        System.out.println("Faculty is created");
        facultyId++;
    }

    public double getSalary() {
        return salary;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
