//write a program to  calculate simple intrest using no argument with return value
class Simple
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
		double output()
		{
			si=p*r*n/100;
			return si;
		}
}
class J12
{
	public static void main(String args[])
	{
		double si;
		Simple s1 = new Simple();
		s1.input();
		si = s1.output();
		System.out.println("Simple Intrest is :"+si);
	}
}
