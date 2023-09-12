//write a program of class and object of static member variable and non static method
class Abc
{
	static int a=0;
	void setdata()
	{
		a++;
	}
	void display()
	{
		System.out.println("Value of A is :"+a);
	}
}
class J41
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		a1.setdata();
		a1.display();

		Abc a2 = new Abc();
		a2.setdata();
		a2.display();

		Abc a3 = new Abc();
		a3.setdata();
		a3.display();
	}
}
