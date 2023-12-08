//write a program to calculate simple intrest.(no argument with return)
class Si
{
	double p,r,n,si;
	void input()
	{
		System.out.print("Enter Amount:");
		p = Double.parseDouble(System.console().readLine());
		System.out.print("Enter Rate:");
		r = Double.parseDouble(System.console().readLine());
		System.out.print("Enter Year:");
		n = Double.parseDouble(System.console().readLine());
	}
	double process()
	{
		si = p*r*n/100;
		return si;
	}
}
class J25
{
	public static void main(String args[])
	{
		double si;

		Si s1 = new Si();
		s1.input();
		si = s1.process();
		System.out.println("Simple Intrest is :"+si);
	}
}
