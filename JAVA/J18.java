//write a program to  input 10 number and calculate total and average.
class Pay
{
	int sal;
	double hra,ma,ta,da,pf,it,gs=0,ns=0;
	
	void input()
	{
		System.out.print("Enter Salary:");
		sal = Integer.parseInt(System.console().readLine());
	}
	int sal()
	{
		return sal;
	}
	double hra()
	{
		hra = sal*10/100;
		return hra;
	}
	double ma()
	{
		ma = 500;
		return ma;
	}
	double ta()
	{
		ta = sal*7.5/100;
		return ta;
	}
	double da()
	{
		da = sal*35/100;
		return da;
	}
	double pf()
	{
		if(sal>=18000)
		{
			pf = 1800;
		}
		else if(sal>=12000)
		{
			pf = 1500;
		}
		else if(sal>=8000)
		{
			pf = 1000;
		}
		else
		{
			pf = 0.0;
		}
		return pf;
	}
	double gs()
	{
		gs = sal+hra+ma+da+ta;
		return gs;
	}
	double it()
	{
		it = gs*10/100;
		return it;
	}
	double ns()
	{
		ns = gs-(pf+it);
		return ns;
	}
}
class J18
{
	public static void main(String args[])
	{
		int sal;
		double hra,ma,ta,da,pf,it,gs,ns;
		

		Pay p1 = new Pay();
		p1.input();
		sal = p1.sal();
		hra = p1.hra();
		ma = p1.ma();
		ta = p1.ta();
		da = p1.da();
		pf = p1.pf();
		gs = p1.gs();
		it = p1.it();
		ns = p1.ns();

		System.out.println("Salary is :"+sal);
		System.out.println("HRA is :"+hra);
		System.out.println("MA is :"+ma);
		System.out.println("TA is :"+ta);
		System.out.println("DA is :"+da);
		System.out.println("PF is :"+pf);
		System.out.println("IT is :"+it);
		System.out.println("Gross Salary is :"+gs);
		System.out.println("Net Salary is :"+ns);
	}
}
