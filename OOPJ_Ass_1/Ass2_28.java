/*
 * Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method along with methods of Long class).
 */

class q28
{
    public static void main(String[] args) 
    {
        //Double to string
        double l1=1000L;
        String st = Double.toString(l1);
        System.out.println(st);

        //Double value to Double instance
        Double lg= new Double(l1);
        System.out.println(lg);

        //String instance to Double instance

        String str=new String("2000");
        Double lg2 = new Double(Double.valueOf(str));
        System.out.println(lg2);

        //Double into binary octal hexadecimal
        String s1= Double.toBinaryString(l1);
        System.out.println("binary "+s1);
        String s2= Double.(l1);
        System.out.println("octal "+s2);
        String s3=Double.toHexString(l1);
        System.out.println("hexadecimal "+s3);

    }
}
    
