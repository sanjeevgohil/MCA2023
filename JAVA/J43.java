//write a program of method overloding //polymorphisam
class Abc
{
	void dispdata()
	{
		System.out.println("Welcome");
	}
	void dispdata(String nm)
	{
		System.out.println("Welcome "+nm);
	}
	void dispdata(int age)
	{
		System.out.println("Your Age is "+age);
	}
	void dispdata(String nm,String lnm)
	{
		System.out.println("Name is : "+nm);
		System.out.println("Surname is : "+lnm);
	}
}
class J43
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		a1.dispdata();
		a1.dispdata("Sanjeev");
		a1.dispdata(22);
		a1.dispdata("Sanjeev","Gohil");
	}
}
