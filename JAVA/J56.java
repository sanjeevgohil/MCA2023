//Write a program of constructor in Inheritance
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
}
class C extends B
{
	int c;
	C(int c)
	{
		super(c);
		this.c = c;
		System.out.println("Value of C is:"+c);
	}
	int total()
	{
		return super.a+super.b+c;
	}
}
class J56
{
	public static void main(String args[])
	{
		C c1 = new C(10);
		int tot = c1.total();
		System.out.println("Total is :"+tot);
	}
}
