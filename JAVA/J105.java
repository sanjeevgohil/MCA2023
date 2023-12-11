//Character Stream (output Stream)

import java.io.*;

class J105
{
	public static void main(String args[])
	{
		try {
			FileReader f1 = new FileReader(args[0]);
			int i;
			while ((i=f1.read())!=-1) {
				System.out.println((char)i);
			}
			f1.close();
		} catch (Exception e) {
			System.out.println("Error Is:"+e);
		}
	}
}