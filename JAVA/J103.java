//Byte Stream (Output Stream)

import java.io.*;

class J103
{
	public static void main(String args[])
	{
		try {
			FileInputStream f1 = new FileInputStream(args[0]);
			int i;
			while ((i=f1.read())!=-1) {
				System.out.println("I is :"+i);
			}
			f1.close();
		} catch (Exception e) {
			System.out.println("Error Is:"+e);
		}
	}
}