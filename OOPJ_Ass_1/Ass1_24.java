/*
Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string. */ 
class Ass1_24
{
    public static void main(String [] args)
    {
        float fl = 20f;

        String s1 = Float.toString(fl);
        System.out.println("Float value to String: "+s1);
        
        float fd = new Float(fl);
        System.out.println("float value into Float instance: "+fd);

        String s2 = new String("2000");
        float fs = new Float(Float.valueOf(s2));
        System.out.println("String instance into Float instance"+fs);

        String s3 = Float.toHexString(fl);
        System.out.println("float value into hexadecimal string: "+s3);

    }
}
