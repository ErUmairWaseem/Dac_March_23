/*
 * Write a program to convert:
    a. long value into String
    b. long value into Long instance.
    c. String instance into Long instance.
    d. long value into binary, octal and hexadecimal string.
 */
class Ass1_20
{
    public static void main(String [] args)
    {
        long a = 30L;
        String str = Long.toString(a);
        System.out.println("Long value into String: "+str);

        long h= 50L;
        Long b = new Long(h);
        System.out.println("Long value into Integer instance: "+b);

        String str1 = new String (str);
        Long c = Long.parseLong(str1);
        System.out.println("String instance into Long instance: "+c); 

        String s1 = Long.toBinaryString(a);
        System.out.println("int value into binary: "+s1);
        
        String s2 = Long.toHexString(a);
        System.out.println("int value into hexadecimal: "+s2);

        String s3 = Long.toOctalString(a);
        System.out.println("int value into Octal: "+s3);
    }
}
