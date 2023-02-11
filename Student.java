package Library_Management_System;
import java.util.*;

public class Student {
	public String student_name;
	public String student_id;
	public String student_stream;
	public int student_year;
	public String student_mobile;
	
	Scanner sc = new Scanner(System.in);
	
	public int book_count = 0;
	Book issued_book[] = new Book[3];		//Max number of books allowed per student at a time
	
	public Student()
	{
		System.out.println("Enter Student's Name: ");
		this.student_name = sc.nextLine();
		
		System.out.println("Enter Student's ID: ");
		this.student_id = sc.nextLine();
		
		System.out.println("Enter Student's Stream: ");
		this.student_stream = sc.nextLine();
		
		System.out.println("Enter Student's Year: ");
		this.student_year = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Student's Mobile No: ");
		this.student_mobile = sc.nextLine();
	}
	
	/*public static void main(String args[])
	{
		Student obj = new Student();
	}*/
	

}
