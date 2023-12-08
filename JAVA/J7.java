//write an program to create another class (No Arguement No Return  using User Define Function)
class Abc
{
	int a,b; //Member Variable
	void setdata() //Member Method
	{
		a=10;
		b=20;	
	}
	void display()
	{
		System.out.println("Value Of A is :"+a);
		System.out.println("Value Of B is :"+b);
	}
}
class J7
{
	public static void main(String args[])
	{	
		Abc a1 = new Abc(); //Object of class Abc
		a1.setdata();
		a1.display();
	}
}