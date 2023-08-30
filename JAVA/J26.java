//write a program to calculate simple intrest.(with argument with return)
class Si
{
	double si;
	
	double process(double p,double r,double n)
	{
		si = p*r*n/100;
		return si;
	}
}
class J26
{
	public static void main(String args[])
	{
		double p,r,n,si;

		System.out.print("Enter Amount:");
		p = Double.parseDouble(System.console().readLine());
		System.out.print("Enter Rate:");
		r = Double.parseDouble(System.console().readLine());
		System.out.print("Enter Year:");
		n = Double.parseDouble(System.console().readLine());
		Si s1 = new Si();

		si = s1.process(p,r,n);
		System.out.println("Simple Intrest is :"+si);
	}
}
