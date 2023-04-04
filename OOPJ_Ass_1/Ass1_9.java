/*
  9. Write a program to convert state of Byte instance into byte, short, int. long, float and double.
 */

class Test 
{
    public static void main(String [] args)
    {
        Byte b = new Byte("123");
        System.out.println("Byte to byte: "+b);

        short s = Byte.valueOf(b);
        System.out.println("Byte to Short: "+s);

        int i = (int)b;
        System.out.println("Byte to Integer: "+i);

        long ls = (long)b;        //Widening
        System.out.println("Byte to Long: "+ls);

        float fl = (float)b;     //Widening
        System.out.println("Byte to float: "+fl);

        double db = (double)b;   //Widening
        System.out.println("Byte to double: "+db);


    }
}
