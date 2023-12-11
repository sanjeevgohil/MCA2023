//Hashset

import java.util.*;

class J109
{
	public static void main(String args[])
	{
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		hashSet.add("Three");

		Iterator<String> i = hashSet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}