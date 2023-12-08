//Write a program of constructor Inheritance
class A
{
	int a;
	A(int a)
	{
		this.a = a;
		System.out.println("Value of A is:"+a);
	}
}
class B extends A
{
	int b;
	B(int b)
	{
		super(b);
		this.b = b;
		System.out.println("Value of B is:"+b);
	}
	int total()
	{
		return super.a+b;
	}
}
class J55
{
	public static void main(String args[])
	{
		B b1 = new B(10);
		int tot = b1.total();
		System.out.println("Total is :"+tot);
	}
}