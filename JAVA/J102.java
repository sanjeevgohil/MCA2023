//Byte Stream (Output Stream)

import java.io.File;
import java.io.FileOutputStream;

class J102
{
	public static void main(String args[])
	{
		try {
			FileOutputStream f1 = new FileOutputStream(args[0]);
			for(int i=1;i<=10;i++)
			{
				f1.write(i);
			}
			f1.close();
		} catch (Exception e) {
			System.out.println("Error Is:"+e);
		}
	}
}