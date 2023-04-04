/*
 * Write a program to find minimum and maximum number as well as to add two long numbers using methods of Long.

 */

import java.util.Scanner;
class q22 
{
        public static void main(String[] args) 
        {
        long l1,l2;
        Scanner sc= new Scanner(System.in);
        l1=sc.nextLong();
        l2=sc.nextLong();

        System.out.println("Minimum value is "+(Long.min(l1, l2)));
        System.out.println("Maximum value is "+(Long.max(l1, l2)));
        System.out.println("dum of the two  value is "+(l1+l2));
        sc.close();
    }
}
