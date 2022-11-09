package six;

import java.util.Scanner;

public class Employee {
    String name;
    private static int empId;
    String result;
    int[] assessment = new int[3];

    public Employee(String name){
        empId++;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter assessment scores:");
        for(int i = 0; i < 3; i++){
            this.assessment[i] = input.nextInt();
        }
    }

    void promotion() {
        if(assessment[0] >= 75 && assessment[1] >= 75 && assessment[2] >= 75) {
            System.out.println("You are Promoted");
            result = "Promoted";
        }
        else {
            System.out.println("You are Demoted");
            result = "Demoted";
        }
    }

    int totalAssessment() {
        return assessment[0] + assessment[1] + assessment[2];
    }
    double percentage(int total) {
        total = totalAssessment();
        return Math.floor((float) total /300 * 100);
    }

    void display() {
        System.out.println("Total assessment mark is " + totalAssessment() + " out of 300\n" +
                "Percentage is " + percentage(totalAssessment()) + "%");
    }
}
