//write a program of Hyrarchical Inheritance
class Student_info
{
	int rollno;
	String name,city,contact;
	void stud_getinfo(){
		System.out.print("Enter Roll No:");
		rollno = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Name:");
		name = System.console().readLine();
		System.out.print("Enter City:");
		city = System.console().readLine();
		System.out.print("Enter Contact:");
		contact = System.console().readLine();
	}
	void stud_dispinfo(){
		System.out.println("-----Student Personal Information-----");
		System.out.println("Roll No is :"+rollno);
		System.out.println("Name is :"+name);
		System.out.println("City is :"+city);
		System.out.println("Contact is :"+contact);
	}
}
class Exam extends Student_info
{
	String subject,total_mark,obtain_mark,result;
	void exam_getinfo(){
		System.out.print("Enter Subject:");
		subject = System.console().readLine();
		System.out.print("Enter Total Mark:");
		total_mark = System.console().readLine();
		System.out.print("Enter Obtain Mark:");
		obtain_mark = System.console().readLine();
		System.out.print("Enter Result:");
		result = System.console().readLine();
	}
	void exam_dispinfo(){
		System.out.println("-----Student Exam Information-----");
		System.out.println("Roll No is :"+rollno);
		System.out.println("Subject is :"+subject);
		System.out.println("Total Mark is :"+total_mark);
		System.out.println("Obtain Mark is :"+obtain_mark);
		System.out.println("Result is :"+result);
	}
}
class Sports extends Student_info
{
	String game,achivement,result;
	void sport_getinfo(){
		System.out.print("Enter Game:");
		game = System.console().readLine();
		System.out.print("Enter Result:");
		result = System.console().readLine();
		System.out.print("Enter Achivement:");
		achivement = System.console().readLine();
	}
	void sport_dispinfo(){
		System.out.println("-----Student Sports Information-----");
		System.out.println("Roll No is :"+rollno);
		System.out.println("Game is :"+game);
		System.out.println("Result of Game is :"+result);
		System.out.println("Achivement is :"+achivement);
	}
}
class J49
{
	public static void main(String args[])
	{
		Exam e1 = new Exam();
		Sports s1 = new Sports();
		e1.stud_getinfo();
		e1.exam_getinfo();
		s1.sport_getinfo();

		e1.stud_dispinfo();
		e1.exam_dispinfo();
		s1.sport_dispinfo();
	}
}
