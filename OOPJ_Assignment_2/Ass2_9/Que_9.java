
/*
 * 9. Date Class
You are required to write a Java program to implement a Date class.
The Date class should have the following fields:
a. day: An integer field to store the day of the month.
b. month: An integer field to store the month of the year.
c. year: An integer field to store the year.
The Date class should have the following methods:
a. isValid(): A method to check if the date is valid or not. A date is considered 
valid if it is a valid date of the Gregorian calendar, and has a day, month, and 
year that are within a reasonable range.
b. getDayOfWeek(): A method to return the day of the week for the given date, 
where Sunday is represented by 0, Monday by 1, and so on.
c. isLeapYear(): A method to check if the year of the given date is a leap year or not.
d. getNextDay(): A method to return the date of the next day.
e. getPreviousDay(): A method to return the date of the previous day.
Example Usage
Date date = new Date(31, 12, 2022);
System.out.println(date.isValid()); // true
System.out.println(date.getDayOfWeek()); // 6 (Saturday)
System.out.println(date.isLeapYear()); // false
Date nextDay = date.getNextDay();
System.out.println(nextDay); // 01-01-2023
Date previousDay = date.getPreviousDay();
System.out.println(previousDay); // 30-12-2022
 */

 import java.time.LocalDateTime;
 import java.util.Scanner;
 
 class Date {
     int day;
     int month;
     int year;
 
     boolean isValid(){
         try{
             LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
             return true;
         }
         catch(Exception e ){
             System.out.println("Invalid date!!!!");
             return false;
         }
     }
 
     void getDayOfWeek(){
         if(isValid()){
             LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
             System.out.println(ldt.getDayOfWeek());
             
         }
         else
         System.out.println("invalid date!!!");
 
     }
 
     void isLeapYear(){
         if(isValid()){
             LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
             int y = ldt.getYear();
             if (y%400==0) {
                 System.out.println("LEAP Year ");}
                 else if(y%100==0){
                 System.out.println("NOT a LEAP Year ");}
                 else if(y%4==0){
                 System.out.println("LEAP Year ");}
                 else{
                 System.out.println("NOT a LEAP Year ");}
         
             
         }
         else
         System.out.println("invalid date!!!");
 
     }
     void getNextDay(){
         if(isValid()){
             LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
             System.out.println("Next day : "+ldt.plusDays(1));
             
         }
         else
         System.out.println("invalid date!!!");
 
     }
 
     void getPreviousDay(){
         if(isValid()){
             LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
             System.out.println("Previous day : "+ldt.minusDays(1));
             
         }
         else
         System.out.println("invalid date!!!");
 
     }
 
 
 
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         Date d=new Date();
         System.out.println("Enter day month year one by one: ");
         d.day=sc.nextInt();
         d.month=sc.nextInt();
         d.year=sc.nextInt();
 
         System.out.println("Date isValid: "+d.isValid()); 
         d.getDayOfWeek();
         d.isLeapYear();
         d.getNextDay();
         d.getPreviousDay();
 
 
         
     }
 
 }