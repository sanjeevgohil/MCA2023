//write a program to  input 10 number and calculate total and average.
class Arith
{
		int total(int a[])
		{
			int i,tot=0;
			for(i=0;i<a.length;i++){
				tot = tot+a[i];
			}
			return tot;
		}
		double avg(int a[])
		{
			int i,tot=0;
			double a1;
			for(i=0;i<a.length;i++){
				tot = tot+a[i];
			}
			a1 = (double)tot/a.length;
			return a1;
		}
}
class J14
{
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException
	{
		int a[] = new int[10],i;
		for(i=0;i<a.length;i++){
			System.out.print("Enter Number:");
			a[i] = Integer.parseInt(System.console().readLine());
		}

		Arith a1 = new Arith();
		int tot = a1.total(a);
		double avg1 = a1.avg(a);

		System.out.println("Total is :"+tot);
		System.out.print("Average is :"+avg1);
	}
}
