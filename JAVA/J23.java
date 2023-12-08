//write a program to calculate simple intrest.(no argument no return)
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
	void process()
	{
		si = p*r*n/100;
	}
	void output()
	{
		System.out.println("Simple Intrest is :"+si);
	}
}
class J23
{
	public static void main(String args[])
	{
		Si s1 = new Si();
		s1.input();
		s1.process();
		s1.output();		
	}
}
