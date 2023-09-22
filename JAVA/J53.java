//Write a program of constructor in Inheritance
class A
{
	A()
	{
		System.out.println("Class A Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B Constructor");
	}
}
class J53
{
	public static void main(String args[])
	{
		B b1 = new B();
	}
}
