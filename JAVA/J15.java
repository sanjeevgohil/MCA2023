//write a program to  input 10 number and calculate total and average.
class pay
{
	double hra,ma,ta,da,pf,it,gs,ns;
	
	double hra(int sal)
	{
		hra = sal*10/100;
		return hra;
	}
	double ma(int sal)
	{
		ma = 500;
		return ma;
	}
	double ta(int sal)
	{
		ta = sal*7.5/100;
		return ta;
	}
	double da(int sal)
	{
		da = sal*35/100;
		return da;
	}
	double pf(int sal)
	{
		if(sal>8000)
		{
			pf = 1000;
		}
		else if(sal>12000)
		{
			pf = 1500;
		}
		else if(sal>18000)
		{
			pf = 1800;
		}
		return pf;
	}
	double it(int sal)
	{
		it = gs*10/100;
		return it;
	}
	double gs(int sal)
	{
		gs = (hra+ma+da+ta);
		return gs;
	}
	double ns(int sal)
	{
		ns = gs-(pf+it);
		return ns;
	}
}
class J15
{
	public static void main(String args[])
	{
		int sal;
		double hra,ma,ta,da,pf,it,gs,ns;
		System.out.print("Enter Salary:");
		sal = Integer.parseInt(System.console().readLine());

		pay p1 = new pay();
		hra = p1.hra(sal);
		ma = p1.ma(sal);
		ta = p1.ta(sal);
		da = p1.da(sal);
		pf = p1.pf(sal);
		it = p1.it(sal);
		gs = p1.gs(sal);
		ns = p1.ns(sal);

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
