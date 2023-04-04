/*
 * Write a program to convert state of Short instance into byte,short, int, long, float and double.
 */

public class Ass1_14 
{
    public static void main(String [] args)
    {
        short s= 5;
        Short sh = new Short (s);

        byte b = sh.byteValue();
        System.out.println("Short Intance into byte: "+b);

        short s1 = sh.shortValue();
        System.out.println("Short Intance into byte: "+s1);

        int i = sh.intValue();
        System.out.println("Short Intance into byte: "+i);

        long lo = sh.longValue();
        System.out.println("Short Intance into byte: "+lo);

        float fl = sh.floatValue();
        System.out.println("Short Intance into byte: "+fl);

        double db = sh.doubleValue();
        System.out.println("Short Intance into byte: "+db);

    }
}
