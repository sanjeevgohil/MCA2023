//write a program of Array(runtime intialization)
class J34
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number :");
			a[i] = Integer.parseInt(System.console().readLine());
		}
		for(int i=0;i<=9;i++)
		{
			System.out.println("Number is :"+a[i]);
		}
	}
}
