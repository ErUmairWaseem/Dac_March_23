/*
 * Write a program to convert state of Integer instance into byte, short, int, long, float and double.
 */
class Ass1_17
{
    public static void main(String [] args)
   {

    int b1 = 2;

    Integer b = new Integer(b1);
    
    System.out.println("Integer instance to byte: " + b.byteValue());
    System.out.println("Integer instance to short: " + b.shortValue());
    System.out.println("Integer instance to int: " + b.intValue());
    System.out.println("Integer instance to long: " + b.longValue());
    System.out.println("Integer instance to float: " + b.floatValue());
    System.out.println("Integer instance to double: " + b.doubleValue());

   }
   
}
