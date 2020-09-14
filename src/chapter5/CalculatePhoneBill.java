package chapter5;

import java.util.Scanner;

public class CalculatePhoneBill {

    static Scanner scanner= new Scanner(System.in);
    static double overageCharge= 0.25;
    static double taxPercentage= 0.15;

    public static void main(String args[]){

        double planFee= getPlanFee();
        int overageMinutes= getOverageMinutes();

        scanner.close();

        double overageFee = calculateOverageFee(overageCharge, overageMinutes);

        double totalTax= calculateTax(taxPercentage, planFee, overageFee);

        double finalTotal= calculateFinalTotal(totalTax, overageFee, planFee);

        notifyBillDetails(overageFee, totalTax, finalTotal, planFee);
    }

    public static double getPlanFee(){
        System.out.println("Enter your Plan Fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter the minutes you exceeded:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double calculateOverageFee(double overageCharge, int overageMinutes) {
        double overageFee= overageCharge*overageMinutes;
        return overageFee;
    }

    public static double calculateTax(double taxPercentage, double planFee, double overageFee){
        double totaTax= (planFee + overageFee)*taxPercentage;
        return totaTax;
    }

    public static double calculateFinalTotal(double tax, double overageFee, double planFee ){
        double total= planFee + overageFee + tax;
        return total;
    }

    public static void notifyBillDetails(double overageFee, double totalTax, double finalTotal, double planFee){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + totalTax);
        System.out.println("Total: $" + finalTotal);
    }
}
