package Library_Management_System;
import java.util.*;

public class Book {
	public int book_id;
	public String book_name;
	public String author_name;
	public int book_quantity;
	public int book_quantity_copy;
	
	Scanner sc = new Scanner(System.in);
	
	public Book()
	{
		System.out.println("Enter the Book ID: ");
		this.book_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Book Name: ");
		this.book_name = sc.nextLine();
		
		System.out.println("Enter the Author Name: ");
		this.author_name = sc.nextLine();
		
		System.out.println("Enter the Book Quantity: ");
		this.book_quantity = sc.nextInt();
		book_quantity_copy = this.book_quantity;
	}
	
	/*public static void main(String args[])
	{
		Book ob = new Book();
	}*/
	

}
