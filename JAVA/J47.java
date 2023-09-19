//write a program of Multilevel Inheritance
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
class C extends B
{
	void dispC(){
		System.out.println("Class C");
	}
}
class J47
{
	public static void main(String args[])
	{
		C c1 = new C();
		c1.dispA();
		c1.dispB();
		c1.dispC();
	}
}
