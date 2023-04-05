import java.util.Scanner;


/*
 * 5. Telephone Bill Calculation
    You are required to write a Java program to calculate the telephone bill for a given 
    customer based on their usage. The program should take the following inputs from 
    the user:
    a. Customer name
    b. Phone number
    c. Number of calls made
    d. Duration of calls (in minutes)
    The program should then calculate the bill for the customerbased on the following
    criteria:
    a. The first 100 calls are charged at a rate of 50 cents per call.
    b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
    c. All calls are subject to a minimum duration of 1 minute.
    d. Calls with a duration less than 1 minute are rounded up to 1 minute.
    e. There is a flat rate of $10 per month for all customers
 */
public class TelephoneBill 
{
    private String customerName;
    private String phoneNumber;
    private int noOfCalls;
    private int durationOfCalls;

    public TelephoneBill()
    {
        this.customerName = "No Name";
        this.phoneNumber = " ";
        this.noOfCalls = 0;
        this.durationOfCalls = 0;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setNoOfCalls(int noOfCalls)
    {
        this.noOfCalls = noOfCalls;
    }
    public int getNoOfCalls()
    {
        return this.noOfCalls;
    }
    public void setDurationOfCalls(int durationOfCalls)
    {
        this.durationOfCalls = durationOfCalls;
    }
    public int getDurationofCalls()
    {
        return this.noOfCalls;
    }
    
}
class Billtest
{
    private static Scanner sc = new Scanner(System.in);
    TelephoneBill pb = new TelephoneBill();
    public void acceptRecord()
    {
        System.out.println("Customer Name: " );
        pb.setCustomerName(sc.nextLine());
        
        System.out.println("Phone Number: ");
        pb.setPhoneNumber(sc.nextLine());
        System.out.println("Duration of calls: ");
        pb.setDurationOfCalls(sc.nextInt());
        System.out.println("No. of calls: ");
        pb.setNoOfCalls(sc.nextInt());
    }
    public void printRecord()
    {
        System.out.println("Name: "+pb.getCustomerName()+"\n"+"Phone Number: "+pb.getPhoneNumber()+"\nNo.of calls in minutes: "+pb.getNoOfCalls()+"\nDuration: "+pb.getDurationofCalls());
    }
    public double calculateBill(int noOfCalls, int durationOfCalls)
    {
        if(noOfCalls<=100)
        {
            double charge = noOfCalls*50;
            return charge;
        }
        else if (noOfCalls>100)
        {
            double temp = noOfCalls-100;
            double charge = temp*25;
            return charge;
        }
        return 10;
    }
}
class Que5
{
    public static void main(String [] args)
    {
        Billtest bt = new Billtest();
        bt.acceptRecord();
        bt.printRecord();
        System.out.println("Your Bill : "+bt.calculateBill(10,20 ));
    }
}