//write a program of Array(compile time intialization)
class J36
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int tot=0;
		for(int i=0;i<=9;i++)
		{
			System.out.println("Number is :"+a[i]);
			tot = tot+a[i];
		}
		System.out.println("Total is :"+tot);
	}
}
