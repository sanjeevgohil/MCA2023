//write a program of parameterized constructor
class Abc
{
	int a,b;

	public Abc(int i,int j)
	{
		a=i;
		b=j;
	}
	void disp()
	{
		System.out.println("Value of A is :"+a);
		System.out.println("Value of B is :"+b);
	}
}
class J19
{
	public static void main(String args[])
	{
		Abc a1 = new Abc(10,20);
		Abc a2 = new Abc(40,50);
		Abc a3 = new Abc(80,90);

		a1.disp();
		a2.disp();
		a3.disp();
	}
}
