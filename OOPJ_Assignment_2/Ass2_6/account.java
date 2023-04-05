import java.util.Scanner;

/*
 * 6. Bank Account Management System
    You are required to write a Java program to manage bank accounts. The program 
    should be able to perform the following operations:
    a. Create a new account
    b. Deposit money into an account
    c. Withdraw money from an account
    d. Display the account balance
    e. Display the account holder's information
    Each account should have the following information:
    a. Account holder's name (String)
    b. Account number (int)
    
    c. Account balance (double)
    The program should be able to perform the following operations:
    a. Create a new account: The program should prompt the user to enter the 
    account holder's name, and generate a unique account number for the new 
    account. The initial account balance should be zero.
    b. Deposit money into an account: The program should prompt the user to enter 
    the account number and the amount to be deposited. If the account number is 
    valid, the program should add the amount to the account balance. If the 
    account number is not valid, the program should display an error message.
    c. Withdraw money from an account: The program should prompt the user to 
    enter the account number and the amount to be withdrawn. If the account 
    number is valid and the account balance is sufficient, the program should 
    deduct the amount from the account balance. If the account number is not 
    valid or the account balance is insufficient, the program should display an 
    error message.
    d. Display the account balance: The program should prompt the user to enter 
    the account number and display the current balance for that account. If the 
    account number is not valid, the program should display an error message.
    e. Display the account holder's information: The program should prompt the 
    user to enter the account number and display the account holder's name and 
    current balance for that account. If the account number is not valid, the 
    program should display an error message.
 */
import java.util.Scanner;

class Customer {
    String name;
    private int accNo;
    private double balance;

    Customer()
    {

    }

    public int getAccNo() 
    {
        return accNo;
    }
    public void setAccNo(int accNo) 
    {
        this.accNo = accNo;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    
}

class CustomerTest
{
    static private Customer cust=new Customer();//static to maintain the changes for each function.
    static Scanner sc = new Scanner(System.in);
    void createAcc(){
        System.out.print("Enter account holder's name: ");
        String name=sc.nextLine();
        cust.name=name;
        
        cust.setAccNo((int)(Math.random()*1000));
        cust.setBalance(0);
        System.out.println("Your Name is: "+ cust.name);
        System.out.println("Your Account No is: "+ cust.getAccNo());

    }

    void deposit(){
        System.out.print("Enter account number: ");
        int accno=sc.nextInt();
        if(accno!= cust.getAccNo())
        {
            System.out.print("Invalid account number ");
            return;
        }
        System.out.print("Enter ammount to be deposited: ");
        double amt=sc.nextDouble();
        cust.setBalance(cust.getBalance()+amt);
        
    }

    void withdraw()
    {
        System.out.print("Enter account number: ");
        int accno=sc.nextInt();
        if(accno!= cust.getAccNo())
            {System.out.println("Invalid account number ");
            return;}
        System.out.print("Enter ammount to be withdrawn: ");
        double amt=sc.nextDouble();
        if(cust.getBalance()>=amt)
            cust.setBalance(cust.getBalance()-amt);
        else
            System.out.println("Low balance!! ");
    }

    void displayBalance()
    {
        System.out.print("Enter account number.: ");
        int accno=sc.nextInt();
        if(accno!= cust.getAccNo())
            {System.out.println("Invalid account number ");
            return;}
        System.out.println("Balance is.: "+ cust.getBalance());
    }

    void diaplayInfo()
    {
        System.out.print("Enter account number.: ");
        int accno=sc.nextInt();
        if(accno!= cust.getAccNo())
            {System.out.print("Invalid account number ");
            return;}
        System.out.println("Name is.: "+ cust.name);
        System.out.println("AccNo is.: "+ cust.getAccNo());
        System.out.println("Balance is.: "+ cust.getBalance());
    }

}
class BankAccManageSys{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        while(true){
            CustomerTest ct = new CustomerTest();

            System.out.println("Enter 1 to create new account \nEnter 2 to deposit money into account \nEnter 3 to withdraw money from account\nEnter 4 to display acc balance\nEnter 5 to display info \n Enter any other number to exit");
            int i= sc.nextInt();
            switch(i){
                case 1: ct.createAcc();
                        break;
                case 2: ct.deposit();
                        break;
                case 3: ct.withdraw();
                        break;
                case 4: ct.displayBalance();
                        break;
                case 5: ct.diaplayInfo();
                        break;
                default: System.out.println("Thank you ");
                    return;
            }

        }
    }
}
