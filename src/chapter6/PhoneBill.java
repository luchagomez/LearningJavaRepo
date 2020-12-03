package chapter6;

public class PhoneBillCalculator{

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutedUsed;

    public PhoneBillCalculator () {
        id= 0;
        baseCost = 50.00;
        allottedMinutes = 300;
        minutedUsed = 300;
    }

    public PhoneBillCalculator (int id) {
        this.id= id;
        baseCost = 50.00;
        allottedMinutes = 300;
        minutedUsed = 300;
    }

    public PhoneBillCalculator (int id, double baseCost, int allottedMinutes, int minutedUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutedUsed = minutedUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutedUsed(){
        return minutedUsed;
    }

    public void setMinutedUsed(int minutedUsed){
        this.minutedUsed = minutedUsed;
    }

    public double calculateOverage (){
        if(minutedUsed <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = minutedUsed - allottedMinutes;
        return overageMinutes*overageRate;
    }

    public double calculateTax (){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void notifyBillDetails{
        System.out.println("Phone Bill Statement");
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
}