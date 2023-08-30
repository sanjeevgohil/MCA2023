//write a program to calculate simple intrest.(with argument no return)
class Si
{
	double si;
	void process(double p,double r,double n)
	{
		si = p*r*n/100;
	}
	void output()
	{
		System.out.println("Simple Intrest is :"+si);
	}
}
class J24
{
	public static void main(String args[])
	{
		double p,r,n;

		System.out.print("Enter Amount:");
		p = Double.parseDouble(System.console().readLine());
		System.out.print("Enter Rate:");
		r = Double.parseDouble(System.console().readLine());
		System.out.print("Enter Year:");
		n = Double.parseDouble(System.console().readLine());

		Si s1 = new Si();
		s1.process(p,r,n);
		s1.output();		
	}
}
