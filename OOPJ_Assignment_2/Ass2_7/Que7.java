import java.util.Scanner;

class TollBooth{
    private double distanceTravelled ;
    private double tollFee;
    private Vehical newveh = new Vehical();

    public void showMenu()
    {
        System.out.println("WELCOME TO THE TOLL SERVICES ENTER YOUR CHOICE");
        System.out.println("1 . ENTER DETAILS");
        System.out.println("2 . CALCULATE TOLL FEE");
        System.out.println("3 . GENERATE BILL");
    }


   public double calculateToll(String VehicalType ,double distanceTravelled ,int numofaxel){
    if(VehicalType == "car"|| VehicalType =="bus" || VehicalType == "van")
    {
       
        tollFee= (distanceTravelled*0.25)*numofaxel;
    }
    else if(VehicalType=="truck")
    {
        tollFee=(distanceTravelled*0.50)*numofaxel;
    }
    else
     {
        System.out.println("Enter valid vehical type");
    }
    return tollFee;
    }

    public void  generateBill(double tollFee)
    {
         System.out.println("YOUR TOLL FEE IS "+tollFee+" + $2.00 processing fee = " +(tollFee+2.00));
    }
}
class Vehical{
    String vehicalType;
    int vehicalNum;
    int numOfAxel;
    double distanceInfo;
    private Scanner sc = new Scanner(System.in);

    public void setDetails(){
        System.out.println("ENTER VEHICAL NUMBER");
        this.vehicalNum=sc.nextInt();
        System.out.println("Enter vehical type as car/bus/van/truck");
        vehicalType= sc.next();
        System.out.println("Enter number of axels");
        numOfAxel=sc.nextInt();
        System.out.println("enter distance travelled");
        distanceInfo=sc.nextDouble();
    }
}
     
public class Que7 {
    public static void main(String[] args) {
        Vehical newveh = new Vehical();
        TollBooth newtoll = new TollBooth();
        int choice ;
        Scanner sc = new Scanner (System.in);
        while((choice = sc.nextInt())!=0){
            newtoll.showMenu();
            switch (choice){
                case 1 : newveh.setDetails();
                break;
                case 2 : newtoll.calculateToll(newveh.vehicalType, newveh.distanceInfo,newveh.numOfAxel);
                break;
                case 3 : newtoll.generateBill(newtoll.calculateToll(newveh.vehicalType, newveh.distanceInfo,newveh.numOfAxel));
                break;
            }
        }
        
    }
    
}
