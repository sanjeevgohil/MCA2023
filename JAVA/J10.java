//write a program to create a class and pass name and age as argument and display it.
class Abc
{
	int no1,no2;
	void setdata(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
	}
	void disp()
	{
		System.out.println("No1 is :"+no1);
		System.out.println("No2 is :"+no2);
	}
}
class J10
{
	public static void main(String args[])
	{
		int no1,no2;

		System.out.print("Enter 1st No:");
		no1 = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 2nd No:");
		no2 = Integer.parseInt(System.console().readLine());

		Abc a1 = new Abc();
		a1.setdata(no1,no2);
		a1.disp();
		
	}
}
