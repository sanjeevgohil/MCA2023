//write a program of Swith case(using character)
import java.util.*;
class J32
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int a,b,ans;
		char ch;
		System.out.print("Enter First Number: :");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Second Number :");
		b = Integer.parseInt(System.console().readLine());

		System.out.println("ARTITHMETIC OPERATION");
		System.out.println("+. Addition");
		System.out.println("-. Subtraction");
		System.out.println("*. Multiplication");
		System.out.println("/. Division");
		System.out.print("Enter Your Choice :");
		ch = s1.next().charAt(0);
		switch(ch){
			case '+':
				ans = a+b;
				System.out.println("Addition is :"+ans);
				break;
			case '-':
				ans = a-b;
				System.out.println("Subtraction is :"+ans);
				break;
			case '*':
				ans = a*b;
				System.out.println("Multiplication is :"+ans);
				break;
			case '/':
				ans = a/b;
				System.out.println("Division is :"+ans);
				break;
			default:
				System.out.println("Wrong Choice.....Try Again.....");
		}
	}
}
