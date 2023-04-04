/*
6.Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
 */

class Convert 
{
    public static void main(String [] args)
    {
        Boolean b1 = new Boolean(true);
        String str = Boolean.toString(b1);
        
        Boolean b2 = new Boolean("ABC");
        
        String s = new String("DEF");
        Boolean b3 = Boolean.valueOf(s);

        Boolean b4 = new Boolean(Boolean.valueOf(s));

        System.out.println(str);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
    
}
