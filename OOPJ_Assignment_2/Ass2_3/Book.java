package Ass2_3;

/*
 * 3. Book Inventory Management System
    You are required to write a Java program to implement a Book class that can be 
    used to manage a book inventory system. 
    The Book class should have the following fields:
    a. title: A string field to store the title of the book.
    b. author: A string field to store the name of the author of the book.
    c. publisher: A string field to store the name of the publisher of the book.
    d. isbn: A string field to store the ISBN number of the book.
    e. year: An integer field to store the year in which the book was published.
    f. price: A double field to store the price of the book.
    g. quantity: An integer field to store the quantity of the book in the inventory.
    The Book class should have following methods
    a. Constructors, 
    b. Getter & setter methods
    c. Business Logic methods
    I. increaseQuantity(int quantity ): A method to increase the quantity of 
    the book in the inventory by the specified amount.
    II. decreaseQuantity(int quantity): A method to decrease the quantity of 
    the book in the inventory by the specified amount.
    III. getInventoryValue(): A method to calculate the total value of the 
    inventory of the book, which is the product of the price and the 
    quantity of the book.
 */


//packagAss2_3_3;

import java.util.Scanner;
class Book
{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String year;
    private double price;
    private int quantity;
    
    public Book()
    {
        this.title = null;
        this.author = " ";
        this.publisher = " ";
        this.isbn = " ";
        this.year = " ";
        this.price = 0.0;
        this.quantity = 0;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public String getPublisher()
    {
        return this.publisher;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public String getIsbn()
    {
        return this.isbn;
    }
    public void setYear(String year)
    {
        this.year = year;
    }
    public String getYear()
    {
        return this.year;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public void increaseQuantity(int quantity)
    {
        this.quantity += quantity;
    }
    public void decreaseQuantity(int quantity) 
    {
		this.quantity -= quantity;
	}
    public double getInventoryValue()
    {
        double totalQuantity = this.quantity*this.price;
        return totalQuantity;
    }
    
}
class BookTest
{
    private static Scanner sc = new Scanner(System.in);
    Book book = new Book();
    // private int quantity;
    // private int price;

    public void acceptRecord()
    {
        System.out.println("Enter Book Title: ");
        book.setTitle(sc.nextLine());

        System.out.println("Enter book author");
        book.setAuthor(sc.nextLine());
        
        System.out.println("Enter Book Publisher: ");
        book.setPublisher(sc.nextLine());

        System.out.println("Enter book ISBN: ");
        book.setIsbn(sc.nextLine());

        System.out.println("Enter Book Year: ");
        book.setYear(sc.nextLine());

        System.out.println("Enter  Book Quantity: ");
        book.setQuantity(sc.nextInt());
        
        System.out.println("Enter Book Price: ");
        book.setPrice(sc.nextInt());

    }
    public void printRecord()
    {
        System.out.println("the total value of the Title of the book: "+book.getTitle());
        System.out.println("The Name of Author: "+book.getAuthor());
        System.out.println("The Publisher Name: "+book.getPublisher());
        System.out.println("The ISBN is: "+book.getIsbn());
        System.out.println("The Year of Publishing: "+book.getYear());
        System.out.println("Price of Book: "+book.getPrice());
        System.out.println("Quantity: "+book.getQuantity());

        System.out.println(book.getInventoryValue());
    }
    public void incDecBook()
    {
        book.decreaseQuantity(sc.nextInt());
        book.increaseQuantity(sc.nextInt());
    }   
    
    public static int menuList()
    {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record");
        System.out.println("2.Print Record");
        System.out.println("3.Increase / Decrease Book Quantity");
        System.out.println("4.Enter Choice");
        return sc.nextInt();
    }
    
}
class Que3
{
    public static void main(String [] args)
    {
        BookTest bt = new BookTest();

        int choice;
        while( ( choice = BookTest.menuList( ) ) != 0 )
        {
            switch(choice)
            {
                case 1:
                    bt.acceptRecord();
                    System.out.println("___________________");
                    break;
                case 2:
                    bt.printRecord();
                    System.out.println("____________________");
                    break;
                case 3:
                    bt.incDecBook();
                    
            }
        }
    }
    
}
