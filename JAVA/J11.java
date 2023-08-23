//write a program to create a class and pass name and age as argument and display it.
class Stud
{
	int rno,m1,m2,m3,tot;
	String nm;
	double per;
	void setdata(int rno,String nm,int m1,int m2,int m3)
	{
		this.rno=rno;
		this.nm=nm;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		tot = m1+m2+m3;
		per = tot/3;
	}
	void disp(){
		System.out.println("Roll No is:"+rno);
		System.out.println("Name is:"+nm);
		System.out.println("Mark 1 is:"+m1);
		System.out.println("Mark 2 is:"+m2);
		System.out.println("Mark 3 is:"+m3);
	}
	int gettot()
	{
		return tot;
	}
	double getper()
	{
		return per;
	}
}
class J11
{
	public static void main(String args[])
	{
		int rno,m1,m2,m3,tot;
		String nm;
		double per;

		System.out.print("Enter Roll Number:");
		rno = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Name:");
		nm = System.console().readLine();
		System.out.print("Enter Mark 1:");
		m1 = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Mark 2:");
		m2 = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Mark 3:");
		m3 = Integer.parseInt(System.console().readLine());

		Stud s1 = new Stud();
		s1.setdata(rno,nm,m1,m2,m3);
		s1.disp();
		tot = s1.gettot();
		per = s1.getper();

		System.out.println("Total is :"+tot);
		System.out.println("Percentabe is :"+per);
	}
}
