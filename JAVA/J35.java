//write a program of Array
class J35
{
	public static void main(String args[])
	{
		System.out.print("Enter Size of Array:");
		int no = Integer.parseInt(System.console().readLine());

		int a[] = new int[no];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Number :");
			a[i] = Integer.parseInt(System.console().readLine());
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Number is :"+a[i]);
		}
	}
}
