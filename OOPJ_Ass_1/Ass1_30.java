/*
 * Write a program to find minimum and maximum number as well as to add two double numbers using methods of Double
 */
import java.util.Scanner;
class Ass1_30 {
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Minimum value is "+Double.min(d1, d2));
        System.out.println("Maximum value is "+Double.max(d1, d2));
        System.out.println("Sum of the two  value is "+(d1+d2));
        sc.close();
    }
    
}
