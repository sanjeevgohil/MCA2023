//write a program to calculate pay bill.with argument with return 
class Pay
{
	double hra,ma,ta,da,pf,it,gs=0,ns=0;
	
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
	double gs(int sal)
	{
		gs = sal+hra+ma+da+ta;
		return gs;
	}
	double it(double gs)
	{
		it = gs*10/100;
		return it;
	}
	double ns(double gs)
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

		Pay p1 = new Pay();
		hra = p1.hra(sal);
		ma = p1.ma(sal);
		ta = p1.ta(sal);
		da = p1.da(sal);
		pf = p1.pf(sal);
		gs = p1.gs(sal);
		it = p1.it(gs);
		ns = p1.ns(gs);

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
