//Queue

import java.util.*;

class J108
{
	public static void main(String args[])
	{
		Queue<String> queue = new LinkedList<>();

		queue.add("Apple");
		queue.add("Grapes");
		queue.add("Cherry");

		System.out.println("Queue is :"+queue);

		String front = queue.remove();
		System.out.println("Removed Elements is :"+front);

		System.out.println("Queue After Removed :"+queue);

		queue.add("Date");

		String peeked = queue.peek();
		System.out.println("Peeked Elements is :"+peeked);

		System.out.println("Queue After Peek :"+queue);
	}
}