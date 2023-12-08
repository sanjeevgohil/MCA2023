//write a program of Jagged Array Array
class J39
{
	public static void main(String args[])
	{
		int k =1,c;
		int a[][] = new int[3][];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter" + i+1 +"Row Column Size:");
			c = Integer.parseInt(System.console().readLine());

			a[i] = new int[c];
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
