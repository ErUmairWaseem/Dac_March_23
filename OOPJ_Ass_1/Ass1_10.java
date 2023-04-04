/*
 * 10.Write a program to perform below operations on char type to get:
    a. The number of bits used to represent a char value
    b. The number of bytes used to represent a char value
    c. The minimum value a char
    d. The maximum value a char
 */

class character
{
    public static void main(String [] args)
    {
        System.out.println("Bits: "+Character.SIZE);
        System.out.println("Bits: "+Character.BYTES);
        System.out.println("Bits: "+Character.MAX_VALUE);
        System.out.println("Bits: "+Character.MIN_VALUE);
    }
    
}
