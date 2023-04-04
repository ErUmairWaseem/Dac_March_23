/*
 * Write a program to find minimum and maximum number as well as to add two float numbers using methods of Float.
 */
import java.util.Scanner;
class Ass1_26 {
    public static void main(String [] args)
    {
        float l1, l2;
        Scanner sc= new Scanner(System.in);
        l1=sc.nextFloat();
        l2=sc.nextFloat();

        System.out.println("Minimum value is "+(Float.min(l1, l2)));
        System.out.println("Maximum value is "+(Float.max(l1, l2)));
        System.out.println("Sum of the two float value is "+(l1+l2));
        sc.close();
    }
    
}
