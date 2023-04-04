/*
 * 8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
 */

class Ass2_8 
{
    public static void main(String [] args)
    {

        byte b1 = 12;
        String str = Byte.toString( b1);
        System.out.println("byte value into String: "+str);

        byte b2 = 15;
        byte b3 = new Byte(b2);
        System.out.println("byte value into Byte instance: "+b3);

        String str2 = new String("1230");
        byte b4 = Byte.parseByte(str2);
        //Byte b = new Byte(str2);                  //Wrapper class
        System.out.println("String instance into Byte instance: "+b4);
        
    }
}
