//write a program to create a class and pass name and age as argument and display it.
class Abc
{
	int no1,no2;
	void setdata(int a,int b)
	{
		no1=a;
		no2=b;
	}
	void disp()
	{
		System.out.println("No1 is :"+no1);
		System.out.println("No2 is :"+no2);
	}
}
class J9
{
	public static void main(String args[])
	{
		int a,b;

		System.out.print("Enter 1st No:");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 2nd No:");
		b = Integer.parseInt(System.console().readLine());

		Abc a1 = new Abc();
		a1.setdata(a,b);
		a1.disp();
		
	}
}
