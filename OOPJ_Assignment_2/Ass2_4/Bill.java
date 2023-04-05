/*
 * 4. Electricity Bill Calculation
    Create a class named "ElectricityBill" that has the following instance variables:
    a. customerName (String)
    b. unitsConsumed (double)
    c. billAmount (double)
    Create a constructor that initializes the customerName and unitsConsumed instance
    variables.
    Define a method named "calculateBillAmount" that calculates the bill amount based 
    on the number of units consumed. The formula for calculating the bill amount is:
    a. For the first 100 units: Rs. 5 per unit
    b. For the next 200 units: Rs. 7 per unit
    c. For the remaining units: Rs. 10 per unit
    Implement the "calculateBillAmount" method in the "ElectricityBill" class.
    Define a main method that creates an object of the "ElectricityBill" class and sets the 
    customerName and unitsConsumed instance variables. Then, call the 
    "calculateBillAmount" method to calculate the bill amount and display the 
    customerName, unitsConsumed, and billAmount.
    */

import java.util.Scanner;
class ElectricityBill
{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    ElectricityBill( )
    {
        this.customerName = " ";
        this.unitsConsumed = 0.0;
        this.billAmount = 0.0;
    }
    public void setName(String customerName)
    {
        this.customerName = customerName;
    }
    public String getName()
    {
        return this.customerName;
    }
    public void setUnits(double unitsConsumed)
    {
        this.unitsConsumed =unitsConsumed;
    }
    public double getUnits( )
    {
        return this.unitsConsumed;
    }

    public void calculateBillAmount(double unitsConsumed)
    {   
        //double eb.unitsConsumed;
        this.getName();
        this.getUnits();
        double price = 1.0;
        if(unitsConsumed <= 100)
        {
            price = unitsConsumed*5;
            System.out.println("Your Electricity Bill is :"+price);
        }
        else if(unitsConsumed>100 && unitsConsumed<=300)
        {
            price = ((100*5)+7*(unitsConsumed-100));
            System.out.println("Your Electricity Bill is :"+price);
        }
        else
        {
            price = (7*300)+(unitsConsumed-300)*10;
            System.out.println("Your Electricity Bill is :"+price);
        }

    }
   
}
class Bill
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ElectricityBill eb = new ElectricityBill();
        
        System.out.println("Enter your Name: ");
        eb.setName(sc.nextLine());
        System.out.println("Enter the Units consumbed by you: ");
        eb.setUnits(sc.nextDouble()); 
        System.out.println("Name: "+eb.getName());
        System.out.println("Units: "+eb.getUnits());
        eb.calculateBillAmount(eb.getUnits());

        sc.close();
        
    }
}
