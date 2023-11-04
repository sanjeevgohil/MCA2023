import First.Second.SI1;
class J86
{
    public static void main(String args[])
    {
        SI1 s1 = new SI1();
        double ans = s1.intcalc(5000,10,2);
        System.out.println("Simple Intrest is :"+ans);

        double ans1 = s1.arecalc(10);
        System.out.println("Area of Circle is :"+ans1);
    }
}