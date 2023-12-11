//Enumaration

import java.util.*;

class J111
{

	public enum Season{Winter,Spring,Summer,Fall}
	
	public static void main(String args[])
	{
		for (Season s: Season.values()) {
			System.out.println(s);
		}
	}
}