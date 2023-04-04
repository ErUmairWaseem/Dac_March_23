/*
 * 12.Write a program to perform below operations on short type to get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short
 */

class Ass2_12 
{
   public static void main(String [] args)
   {
        System.out.println("The number of bits used to represent a short value: "+Short.SIZE);
        System.out.println("The number of bytes used to represent a short value: "+Short.BYTES);
        System.out.println("The minimum value a short: "+Short.MIN_VALUE);
        System.out.println("The maximum value a short: "+Short.MAX_VALUE);
   } 
}
