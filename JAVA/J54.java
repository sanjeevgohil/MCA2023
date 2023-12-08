//Write a program of constructor Inheritance
class A
{
	A(int a)
	{
		System.out.println("Value of A is:"+a);
	}
}
class B extends A
{
	B(int a,int b)
	{
		super(a);
		System.out.println("Value of B is:"+b);
	}
}
class J54
{
	public static void main(String args[])
	{
		B b1 = new B(10,20);
	}
}