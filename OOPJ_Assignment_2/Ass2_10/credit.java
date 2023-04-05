
import java.util.Scanner;

 class CreditScoreCalculator
 {
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;

    public CreditScoreCalculator()
    {
        this.creditHistory = 0;
        this.creditUtilization = 0;
        this.paymentHistory = false;
    }
    public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory)
    {

    }
    public void setCreditHistory(int creditHistory)
    {
        this.creditHistory = creditHistory;
    }
    public int getCreditHistory()
    {
        return this.creditHistory;
    }
    public void setCreditUtilization(double creditUtilization)
    {
        this.creditUtilization = creditUtilization;
    }
    public double getCreditUtilization( )
    {
        return this.creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory)
    {
        this.paymentHistory = paymentHistory;
    }
    public boolean getPaymentHistory( )
    {
        return paymentHistory;
    }
    public int calculateCreditScore()
    {
        int creditScore = ((this.creditHistory*15) + (int)(creditUtilization*30));
        if (getPaymentHistory() == true)
        {
            creditScore = creditScore + 55;
        }
        else
        {
            creditScore = creditScore +35;
        }
        return creditScore;
    }
}
    class TestScore
    {
        private CreditScoreCalculator cdc = new CreditScoreCalculator();
        static Scanner sc = new Scanner(System.in);
        
        public void accept_record()
        {
            System.out.println("Enter Your Credit History: ");
            cdc.setCreditHistory(sc.nextInt()); 
            
            System.out.println("Enter Your Credit Utilization: ");
            cdc.setCreditUtilization(sc.nextDouble());   
            
            System.out.println("Enter Your Payment History as true or false: ");
            cdc.setPaymentHistory(sc.nextBoolean()); 

        }

        public void print_record( )
        {
            System.out.println("Based on you filling details: ");
            System.out.println("Your Credit History: "+cdc.getCreditHistory());
            System.out.println("Your Credit Utilization: "+cdc.getCreditUtilization());
            System.out.println("Your Payment History: "+cdc.getPaymentHistory());

            System.out.println("Your Credit Score: "+cdc.calculateCreditScore());
        }
        public static int menuList()
        {
            System.out.println("0.Exit ");
            System.out.println("1.Accept Record ");
            System.out.println("2.Print Record ");
            System.out.println("Enter Choice ");
            return sc.nextInt();
        }
    }
 
 class score
 {
    public static void main(String [] args)
    {
        int choice;
        TestScore ts = new TestScore();
       
        while( (choice = TestScore.menuList()) != 0 )
        switch(choice)
        {
            
                case 1 : ts.accept_record();
                System.out.println("________________________________");
                break;
                case 2 : ts.print_record();
                System.out.println("________________________________");
                break;
                default : System.out.println("Invalid Choice");
        }
        

    }
 }