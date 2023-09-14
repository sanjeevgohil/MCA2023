//write a program of constructor overloding //polymorphisam
class A
{
	void dispA(){
		System.out.println("Class A");
	}
}
class B extends A
{
	void dispB(){
		System.out.println("Class B");
	}
}
class J45
{
	public static void main(String args[])
	{
		B b1 = new B();
		b1.dispA();
		b1.dispB();
	}
}
