//write a program of 2-dimensional Array
class J37
{
	public static void main(String args[])
	{
		int k =1;
		int a[][] = new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = k++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
	}
}
