//write a program to  calculate simple intrest using with argument no return value
class Simple
{
		double si;
		void disp(double p,double r,double n)
		{
			si=p*r*n/100;
			System.out.println("Simple Intrest is :"+si);
		}
}
class J13
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

		
		Simple s1 = new Simple();
		s1.disp(p,r,n);
	}
}
