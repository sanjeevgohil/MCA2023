//write an program to input student name ,age and city using Console method
class J6
{
	public static void main(String args[])
	{	
		System.out.print("Enter Student Name is:");
		String nm=System.console().readLine();
		System.out.print("Enter Student Age is:");
		int age = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Student City:");
		String city = System.console().readLine();

		System.out.println("Student Name is:"+nm);
		System.out.println("Student Age is:"+age);
		System.out.println("Student City is:"+city);
	}
}