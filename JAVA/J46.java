//write a program of Multilevel Inheritance
class Vehical
{
	String company,model,year;
	void vehicle_getinfo(){
		System.out.print("Enter Company:");
		company = System.console().readLine();
		System.out.print("Enter Model:");
		model = System.console().readLine();
		System.out.print("Enter Year:");
		year = System.console().readLine();
	}
	void vehicle_dispinfo(){
		System.out.println("Company is:"+company);
		System.out.println("Model is:"+model);
		System.out.println("Year is:"+year);
	}
}
class Car extends Vehical
{
	String fule_type,color;
	void car_getinfo(){
		System.out.print("Enter Fuel Type:");
		fule_type = System.console().readLine();
		System.out.print("Enter Color:");
		color = System.console().readLine();
	}
	void car_dispinfo(){
		System.out.println("Fuel Type is:"+fule_type);
		System.out.println("Color is:"+color);
	}
}
class Sports_car extends Car
{
	String speed;
	void sportscar_getinfo(){
		System.out.print("Enter Speed:");
		speed = System.console().readLine();
	}
	void sportscar_dispinfo(){
		System.out.println("Speed is:"+speed);
	}
}
class J46
{
	public static void main(String args[])
	{
		Sports_car s1 = new Sports_car();

		s1.vehicle_getinfo();
		s1.car_getinfo();
		s1.sportscar_getinfo();

		s1.vehicle_dispinfo();;
		s1.car_dispinfo();
		s1.sportscar_dispinfo();
	}
}
