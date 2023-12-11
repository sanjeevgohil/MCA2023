//List

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class J106
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		list.add("Apple");

		for(String fruit : list){
			
			System.out.println(fruit);
		}
		System.out.println("\n"+list);
	}
}