/*
 * Write a program to find minimum and maximum number as well as to add two integer numbers using methods of Integer.
 */
import java.util.Scanner;;
class Ass1_18 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("max integer is "+Integer.max(n, n2));
        System.out.println("min integer is "+Integer.min(n, n2));
        System.out.println("sum of the two integer is "+(n+n2));
        sc.close();

    }
    
}
