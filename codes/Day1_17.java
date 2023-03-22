// Check whether the Given Number is a Palindrome or NOT. 

import java.lang.*;
import java.util.Scanner;

class Palindrome
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int x = sc.nextInt();     //121
		int rev = 0,rem;
		
		while(x != 0)
		{
			rem = x%10;
			rev = rev*10+rem;    //121
			x = x/10;            //0
		}
		if(x == rev)
		{
			System.out.println(x+" is palindrome");
		}	
		else
		{
			System.out.println(x+" is not palindrome");
		}
			
	}
}