//write a program to calculate area of circle.(no argument with return)
class As
{
	double pi=3.14,as;
	int r;
	void input()
	{
		System.out.print("Enter Radius:");
		r = Integer.parseInt(System.console().readLine());
	}
	double output()
	{
		as = pi*r*r;
		return as;
	}
}
class J29
{
	public static void main(String args[])
	{
		double as;

		As a1 = new As();
		a1.input();
		as = a1.output();
		System.out.println("Area of Circle is :"+as);
	}
}
