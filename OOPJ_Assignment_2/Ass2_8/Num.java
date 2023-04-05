package Ass2_8;
/*
*8. Rational Number Calculator
    You are required to write a Java program to perform arithmetic operations on rational 
    numbers. Rational numbers are numbers that can be expressed as a fraction of two 
    integers (i.e., numerator and denominator). The program should take the following 
    inputs from the user:
    Two rational numbers (i.e., two pairs of integers representing the numerator and 
    denominator of each number)
    The program should then perform the arithmetic operation on the two rational 
    numbers and output the result in the form of a reduced fraction (i.e., the numerator 
    and denominator should be as small as possible).
    Example Input
    Enter the first rational number:
    Numerator: 2
    Denominator: 3
    Enter the second rational number:
    Numerator: 1
    Denominator: 6
    Enter the arithmetic operation (+, -, *, /): *
    */


import java.util.Scanner;
public class Num 
{
    int num1, num2, deno1, deno2;

    public void printmenu()
    {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
    }
    public void reduceForm(int y, int x)
    {
        int temp = Math.min(y,x);
        int flag=0;
        for(int i=2; i<=temp;i++)
        {
            if((y%i == 0) && (x%i == 0))
            {
                y /= i;
                x /= i;
                flag = 1;
                break;
            }
        }
    }

    public void reduce_Form(int x, int y)
    {
        int temp = Math.min(x, y);
        int flag=0;
        for(int i=2; i<=temp; i++)
        {
            if((x%i == 0) && (y%i == 0))
            {
                x = x/i;
                y = y/i;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            reduce_Form(x , y);
        }
        else
        {
            System.out.println(y +"/"+ x);
        }
          
    }
    public void get_Record()
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the numerator of the first number");
            this.num1=sc.nextInt();
            System.out.println("Enter the demomenator of the first number");
            this.deno1=sc.nextInt();
            System.out.println("Enter the numerator of the second number");
            this.num2=sc.nextInt();
            System.out.println("Enter the denomenator of the second number");
            this.deno2=sc.nextInt();

    }
    public void add_record()
    {
        int y = this.deno1*this.deno2;
        int x = ((this.deno2*this.num1)+(this.deno1*this.num2));
        int temp = Math.min(y, x);

        System.out.println(this.num1+"/"+this.deno1+"+"+this.num2+"/"+this.deno2+" is ");
        reduce_Form(y, x);
    }
    public void sub_record( ){
        int y = this.deno1*this.deno2;
        int x = ((this.deno2*this.num1)-(this.deno1*this.num2));
        int temp = Math.min(y,x);
        
        System.out.print(this.num1+"/"+this.deno1+"-"+this.num2+"/"+this.deno2+" is ");
        reduce_Form(y, x);
        
        }
    
        public void mult_record()
        {
            int y = this.deno1*this.deno2;
            int x = this.num1*this.num2;
            int temp = Math.min(y,x);
            
            System.out.print(this.num1+"/"+this.deno1+"*"+this.num2+"/"+this.deno2+" is ");
            reduce_Form(y, x);
        }
        public void div_record()
        {
            int y = this.num1*this.deno2;
             int x = this.deno1*this.num2;
            int temp = Math.min(y,x);
                
            System.out.print(this.num1+"/"+this.deno1+"/"+this.num2+"/"+this.deno2+" is ");
            reduce_Form(y, x);
                
        }
    public static void main(String [] args)
    {
        char choice;
        Num n = new Num();
        n.printmenu();
        Scanner sc = new Scanner(System.in);
        String temp=sc.next();
        choice = temp.charAt(0);
        n.get_Record();
        switch(choice)
        {
            case '+' : n.add_record();
            break;
            case '-' : n.sub_record();
            break;
            case '*' : n.mult_record();
            break;
            case '/' : n.div_record();
            break;
            default :
            System.out.println("Invalid");
        }
    }
}
