    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author GOMEZ_CPE113
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
   public static double calculateAverage(double prelim, double midterm, double finals) {
        return (prelim + midterm + finals) / 3;
    }

    public static char getGradeEquivalent(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 85) {
            return 'B';
        } else if (average >= 80) {
            return 'C';
        } else if (average >= 75) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static boolean isPassed(double average) {
        return average >= 75;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Prelim: ");
        double prelim = input.nextDouble();

        System.out.print("Enter Midterm: ");
        double midterm = input.nextDouble();

        System.out.print("Enter Finals: ");
        double finals = input.nextDouble();

        double average = calculateAverage(prelim, midterm, finals);
        char grade = getGradeEquivalent(average);
        boolean passed = isPassed(average);

        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (passed ? "Passed" : "Failed"));

    }
} 
