//write a program to calculate pay bill.with argument no return
class Pay
{
	double sal,hra,ma,ta,da,pf,it,gs=0,ns=0;
	void process(int sal)
	{
		hra = sal*10/100;
		ma = 500;
		ta = sal*7.5/100;
		da = sal*35/100;
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
		gs = sal+hra+ma+da+ta;
		it = gs*10/100;
		ns = gs-(pf+it);
	}
	void output()
	{
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
class J17
{
	public static void main(String args[])
	{
		int sal;
		System.out.print("Enter Salary:");
		sal = Integer.parseInt(System.console().readLine());

		Pay p1 = new Pay();
		p1.process(sal);
		p1.output();	
	}
}
