//write a program to  input 10 number and calculate total and average.
class Pay
{
	double sal,hra,ma,ta,da,pf,it,gs=0,ns=0;
	void input()
	{
		System.out.print("Enter Salary:");
		sal = Integer.parseInt(System.console().readLine());
	}
	void process()
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
class J16
{
	public static void main(String args[])
	{
		Pay p1 = new Pay();
		p1.input();
		p1.process();
		p1.output();	
	}
}
