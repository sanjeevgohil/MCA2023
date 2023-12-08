//write a program of Default constructor overloading
class Abc
{
	public Abc()
	{
		System.out.println("Non - Parameterized Constructor");
	}
	public Abc(String str)
	{
		System.out.println(str);
	}
}
class J22
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		Abc a2 = new Abc("Parameterized Constructor");
	}
}
