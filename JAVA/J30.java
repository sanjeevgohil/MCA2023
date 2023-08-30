//write a program to calculate area of circle.(with argument with return)
class As
{
	double as;
	double output(double pi,double r)
	{
		as = pi*r*r;
		return as;
	}
}
class J30
{
	public static void main(String args[])
	{
		double pi=3.14,r,as;

		System.out.print("Enter Radius:");
		r = Double.parseDouble(System.console().readLine());

		As a1 = new As();
		as = a1.output(pi,r);
		System.out.println("Area of Circle is :"+as);
	}
}
