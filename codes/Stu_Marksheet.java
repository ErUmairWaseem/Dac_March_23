//Write an algorithm to calculate the total marks,average & percentage of five subject of a student.


import java.lang.*;
import java.util.Scanner;

class Stu_Marksheet
{
	
	public static void main(String [] agrs)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first Subject: ");
		int a = scan.nextInt();
		
		System.out.print("Enter second Subject: ");
		int b = scan.nextInt();
		
		System.out.print("Enter Third Subject: ");
		int c = scan.nextInt();
		
		System.out.print("Enter Fourth Subject: ");
		int d = scan.nextInt();
		
		System.out.print("Enter Fifth Subject: ");
		int e = scan.nextInt();
		
		int sum = a+b+c+d+e;
		System.out.print("Sum : "+sum);
		
		int avg = sum/5;
		System.out.print("\nAverage : "+avg);
		
		float per =(float)((sum / 500.00) * 100);
		System.out.print("\nPercentage : "+per+" %");
	}
}