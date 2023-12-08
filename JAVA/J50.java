//Write a program of Interface
interface A{
	void setdata();
	void dispdata();
}
class B implements A
{
	void dispB(){
		System.out.println("Class B Method");
	}
	public void setdata(){
		System.out.println("Interface Set Data Method");
	}
	public void dispdata(){
		System.out.println("Interface Disp Data Method");
	}
}
class J50
{
	public static void main(String args[])
	{
		B b1 = new B();
		b1.dispB();
		b1.setdata();
		b1.dispdata();
	}
}