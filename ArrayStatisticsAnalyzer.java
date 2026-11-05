
package array.statistics.analyzer;

import java.util.Scanner;

public class ArrayStatisticsAnalyzer {

    public static int calculateSum(int[] scores) {
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return sum;
    }

    public static double calculateAverage(int[] scores) {
        return (double) calculateSum(scores) / scores.length;
    }

    public static int findHighest(int[] scores) {
        int highest = scores[0];

        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }

        return highest;
    }

    public static int findLowest(int[] scores) {
        int lowest = scores[0];

        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }

        return lowest;
    }

    public static int countPassing(int[] scores) {
        int count = 0;

        for (int score : scores) {
            if (score >= 75) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of scores: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input! The array must not be empty.");
        } else {

            int[] scores = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter score " + (i + 1) + ": ");
                scores[i] = input.nextInt();
            }

            System.out.println("\nSTATISTICAL INFORMATION");
            System.out.println("Total Number of Scores: " + scores.length);
            System.out.println("Sum of Scores: " + calculateSum(scores));
            System.out.printf("Average Score: %.3f%n", calculateAverage(scores));
            System.out.println("Highest Score: " + findHighest(scores));
            System.out.println("Lowest Score: " + findLowest(scores));
            System.out.println("Number of Passing Students: " + countPassing(scores));
        }

   
    }
}
