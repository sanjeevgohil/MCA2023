//write an program to input student name ,age and city using Scanner class
import java.util.*;
class J5
{
	public static void main(String args[])
	{	
		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter Student Name is:");
		String nm=s1.nextLine();
		System.out.print("Enter Student Age is:");
		String age =s1.nextLine();
		System.out.print("Enter Student City:");
		String city = s1.nextLine();

		System.out.println("Student Name is:"+nm);
		System.out.println("Student Age is:"+age);
		System.out.println("Student City is:"+city);
	}
}