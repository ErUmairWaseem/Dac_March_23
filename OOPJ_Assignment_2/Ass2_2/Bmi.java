/*
 * 2. BMI Calculator 
You have been asked to write a Java program to implement a BMI (Body Mass 
Index) calculator. The program should have the following functionality:
The BMI calculator class should have the following fields:
a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.
The BMI calculator class should have the following methods:
a. A constructor to initialize the height and weight fields of the BMI calculator 
object.
b. Getter and setter methods.
c. Double calculateBMI(): A method to calculate the BMI of the person using the 
following formula: 
BMI = weight / (height * height).
Write a Java program that creates an object of the BMI calculator class, prompts the 
user to input their height and weight, sets the height and weight fields of the BMI 
calculator object using the setter methods, calculates the BMI using the 
calculateBMI() method, and prints the calculated BMI to the console
 */


import java.util.Scanner;

class BmiCalculator
{
    private float height;
    private float weight;

    public BmiCalculator ()
    {
        this.height = 0.0f;
        this.weight = 0.0f;
    }
    public void setHeight(float height)
    {
        this.height = height;
    }
    public float getHeight()
    {
        return this.height;
    }
    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    public float getWeight()
    {
        return this.weight;
    }
}
class BmiTest
{
    private static Scanner sc = new Scanner(System.in);
    private BmiCalculator bm1 = new BmiCalculator();
    
    public void accept_record()
    {
        System.out.println("Enter Your Height: ");
        bm1.setHeight(sc.nextFloat());
        System.out.println("Enter your Height: ");
        bm1.setWeight(sc.nextFloat());
    }

    public void print_record()
    {
        float height = bm1.getHeight();
        float weight = bm1.getWeight();

        float BMI = weight / (height * height);

        System.out.println("Your BMI : "+BMI);
    }
    
}
class Bmi 
{
    public static void main(String [] args)
    {
        BmiTest  test = new BmiTest();
        test.accept_record();
        test.print_record();
    }
}
