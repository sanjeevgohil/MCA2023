//List with array

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class J107
{
	public static void main(String args[])
	{
		String fruit[] = {"Mango","Orange","Banana","Apple"};

		List<String> list = new ArrayList<String>();

		for(String str : fruit)
		{
			list.add(str);
		}

		for(String str : list)
		{
			System.out.println(str);
		}

	}
}