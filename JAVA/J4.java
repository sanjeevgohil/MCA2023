//write an program to input student name ,age and city using inputstream reader and buffered reader
import java.io.*;
class J4
{
	public static void main(String args[]) throws IOException
	{	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		System.out.print("Enter Student Name is:");
		String nm=br.readLine();
		System.out.print("Enter Student Age is:");
		int age =Integer.parseInt(br.readLine());
		System.out.print("Enter Student City:");
		String city = br.readLine();

		System.out.println("Student Name is:"+nm);
		System.out.println("Student Age is:"+age);
		System.out.println("Student City is:"+city);
	}
}