//write a program of 3-dimensional Array
class J38
{
	public static void main(String args[])
	{
		int no =1;
		int a[][][] = new int[3][3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					a[i][j][k] = no++;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println("\t");
			}
			System.out.println();
		}
	}
}
