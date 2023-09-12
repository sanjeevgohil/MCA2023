//write a program of class and object of static member variable and static method
class Abc
{
	static int a=0;
	static void setdata()
	{
		a++;
	}
	static void display()
	{
		System.out.println("Value of A is :"+a);
	}
}
class J42
{
	public static void main(String args[])
	{
		Abc.setdata();
		Abc.display();

		Abc.setdata();
		Abc.display();

		Abc.setdata();
		Abc.display();

	}
}
