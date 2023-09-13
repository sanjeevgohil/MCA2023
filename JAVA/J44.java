//write a program of constructor overloding //polymorphisam
class Abc
{
	Abc()
	{
		System.out.println("Welcome");
	}
	Abc(String nm)
	{
		System.out.println("Welcome "+nm);
	}
	Abc(int age)
	{
		System.out.println("Your Age is "+age);
	}
	Abc(String nm,String lnm)
	{
		System.out.println("Name is : "+nm);
		System.out.println("Surname is : "+lnm);
	}
}
class J44
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		Abc a2 = new Abc("Sanjeev");
		Abc a3 = new Abc(22);
		Abc a4 = new Abc("Sanjeev","Gohil");
	}
}
