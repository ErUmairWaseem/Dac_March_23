/*
 * 16. Write a program to convert:
    a. int value into String
    b. int value into Integer instance.
    c. String instance into Integer instance.
    d. int value into binary, octal and hexadecimal string
 */
class Ass1_16 
{
    public static void main(String [] args)
    {
        int a = 15;
        String str = Integer.toString(a);
        System.out.println("int value into String: "+str);

        Integer b = new Integer("20");
        System.out.println("int value into Integer instance: "+b);

        String str1 = new String (str);
        int c = Integer.parseInt(str1);
        System.out.println("String instance into Integer instance: "+c); 

        String s1 = Integer.toBinaryString(a);
        System.out.println("int value into binary: "+s1);
        
        String s2 = Integer.toHexString(a);
        System.out.println("int value into hexadecimal: "+s2);

        String s3 = Integer.toOctalString(a);
        System.out.println("int value into Octal: "+s3);

    }
    
}
