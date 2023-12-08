//write a program of Swith case(using numeric)
class J31
{
	public static void main(String args[])
	{
		int ch,a,b,ans;

		System.out.print("Enter First Number: :");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Second Number :");
		b = Integer.parseInt(System.console().readLine());

		System.out.println("ARTITHMETIC OPERATION");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter Your Choice :");
		ch = Integer.parseInt(System.console().readLine());

		switch(ch){
			case 1:
				ans = a+b;
				System.out.println("Addition is :"+ans);
				break;
			case 2:
				ans = a-b;
				System.out.println("Subtraction is :"+ans);
				break;
			case 3:
				ans = a*b;
				System.out.println("Multiplication is :"+ans);
				break;
			case 4:
				ans = a/b;
				System.out.println("Division is :"+ans);
				break;
			default:
				System.out.println("Wrong Choice.....Try Again.....");
		}
	}
}
