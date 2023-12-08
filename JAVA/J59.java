class SI{
    double intcalc(double p,double r,double n){
        return p*r*n/100;
    }
}
class J59
{
    public static void main(String args[])
    {
        SI s1 = new SI();
        double ans = s1.intcalc(5000, 10, 5);
        System.out.println("Simple Intrest is :"+ans);

    }
}