//Write a program of Interface Inheritance
interface A{
	void setdata();
}
interface A1 extends A{
	void dispdata();
}
class B 
{
	void dispB(){
		System.out.println("Class B Method");
	}
}
class C extends B implements A1
{
	void dispC(){
		System.out.println("Class C Method");
	}
	public void setdata(){
		System.out.println("Interface Set Data Method");
	}
	public void dispdata(){
		System.out.println("Interface Disp Data Method");
	}
}
class J51
{
	public static void main(String args[])
	{
		C c1 = new C();
		c1.dispB();
		c1.dispC();
		c1.setdata();
		c1.dispdata();
	}
}