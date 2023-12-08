//write an program to input first and last name using inputstream bufferd reader class
import java.io.*;
class J3
{
	public static void main(String args[]) throws IOException
	{	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		System.out.println("Enter First Name is:");
		String fnm=br.readLine();
		System.out.println("Enter Last Name is:");
		String lnm=br.readLine();

		System.out.println("First Name is:"+fnm);
		System.out.println("Last Name is:"+lnm);
	}
}