//write a program to calculate area of circle.(with argument no return)
class As
{
	double as;
	void output(double pi,double r)
	{
		as = pi*r*r;
		System.out.println("Area of Circle is :"+as);
	}
}
class J28
{
	public static void main(String args[])
	{
		double pi=3.14,r;
		System.out.print("Enter Radius:");
		r = Double.parseDouble(System.console().readLine());

		As a1 = new As();
		a1.output(pi,r);
	}
}
