/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electricity.bill.calculator;

import java.util.Scanner;

/**
 *
 * @author GOMEZ_CPE113
 */
public class ElectricityBillCalculator {

    /**
     * @param args the command line arguments
     */
    
public static double calculateConsumptionCharge(double consumption, double rate) {
        return consumption * rate;
    }

    public static double calculateAdditionalCharge(double consumptionCharge, double percentage) {
        return consumptionCharge * (percentage / 100);
    }

    public static double calculateTotalBill(double consumptionCharge, double additionalCharge) {
        return consumptionCharge + additionalCharge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Electricity Consumption (kWh): ");
        double consumption = input.nextDouble();

        System.out.print("Enter Rate per kWh: ");
        double rate = input.nextDouble();

        System.out.print("Enter Additional Charge (%): ");
        double percentage = input.nextDouble();

        double consumptionCharge = calculateConsumptionCharge(consumption, rate);
        double additionalCharge = calculateAdditionalCharge(consumptionCharge, percentage);
        double totalBill = calculateTotalBill(consumptionCharge, additionalCharge);

        System.out.println("ELECTRICITY BILL CALCULATOR");
        System.out.printf("Consumption Charge:PESO = %.2f%n ", consumptionCharge);
        System.out.printf("Additional Charge: PESO = %.2f%n  ", additionalCharge);
        System.out.printf("Total Electricity Bill: PESO = %.2f%n ", totalBill);

    }
    
} 