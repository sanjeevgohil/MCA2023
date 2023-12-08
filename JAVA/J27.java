//write a program to calculate area of circle.(no argument no return)
class As
{
	double pi=3.14,r,as;
	void input()
	{
		System.out.print("Enter Radius:");
		r = Integer.parseInt(System.console().readLine());
	}
	void output()
	{
		as = pi*r*r;
		System.out.println("Area of Circle is :"+as);
	}
}
class J27
{
	public static void main(String args[])
	{
		As a1 = new As();
		a1.input();
		a1.output();
	}
}
