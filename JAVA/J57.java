//Multipath or virtuial Inheritance
interface Stud{
   int rno = 0;
    String nm = null;
    void dispStud();
}
interface Exam extends Stud{
    String sub = null;
    int mark = 0;
    void dispExam();
}
class Sports implements Stud{
    String name;
    int numuplayer;
    public void dispStud(){

    }
    void setdata(String name,int numuplayer){
        this.name = name;
        this.numuplayer = numuplayer;
    }
    void dispSports(){
        System.out.println("Game name is :"+name);
        System.out.println("Numbers of players in game is :"+numuplayer);
    }
}
class Result extends Sports implements Exam{
    
	int rno = 101;
	String nm = "Abcd";
    String sub = "Commerce";
    int mark = 85;

	String examresult;
    String sportsresult;

    public void dispExam(){
        System.out.println("Exam Subject :"+sub);
        System.out.println("Obatain mark :"+mark);
    }
    void setdata(String examresult, String sportsresult){
        super.setdata("Cricket",11);
        this.sportsresult = sportsresult;
        this.examresult = examresult;
    }
    void dispResult(){
        System.out.println("Exam Result is :"+examresult);
        System.out.println("Sports result is :"+sportsresult);
    }
    public void dispStud(){
        System.out.println("Roll no is :"+rno);
        System.out.println("Student Name is :"+nm);
    }
}
public class J57 {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.setdata("Pass","Win");
        r1.dispStud();
        r1.dispExam();
        r1.dispSports();
        r1.dispResult();
    }
}