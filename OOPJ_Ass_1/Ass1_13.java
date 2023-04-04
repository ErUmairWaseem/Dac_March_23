/*
 * 13.Write a program to convert:
    a. short value into String
    b. short value into Short instance.
    c. String instance into Short instance.

 */

class Ass2_13 
{
    public static void main(String [] args)
    {

        short s1 = 15;
        String str = Short.toString(s1);
        System.out.println("Short value into String: "+str);

        Short s2 = new Short ( "12");
        System.out.println("Short value into Short instance: "+s2);

        String str2 = new String("250");
        short s3 = Short.parseShort(str2);
        System.out.println("String instance into Short instance: "+s3);

        

    }
}

