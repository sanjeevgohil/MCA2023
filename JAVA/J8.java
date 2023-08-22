//write a program to create a class and pass name and age as argument and display it.
class Abc
{
	String nm;
	int age;

	void setdata(String nm,int age)
	{
		System.out.println("Name is :"+nm);
		System.out.println("Age is :"+age);
	}
}
class J8
{
	public static void main(String args[])
	{
		String nm;
		int age;

		System.out.print("Enter Name:");
		nm = System.console().readLine();
		System.out.print("Enter Age:");
		age = Integer.parseInt(System.console().readLine());

		Abc a1 = new Abc();
		a1.setdata(nm, age);
		
	}
}