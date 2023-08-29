//write a program of Default constructor
class Abc
{
	int a,b;

	public Abc()
	{
		System.out.print("Enter Value of A:");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Value of B:");
		b = Integer.parseInt(System.console().readLine());
	}
	void disp()
	{
		System.out.println("Value of A is :"+a);
		System.out.println("Value of B is :"+b);
	}
}
class J20
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		Abc a2 = new Abc();
		Abc a3 = new Abc();

		a1.disp();
		a2.disp();
		a3.disp();
	}
}
