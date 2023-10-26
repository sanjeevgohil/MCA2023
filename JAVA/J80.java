//Example of Math Class
import static java.lang.Math.*;
class J80
{
    public static void main(String args[])
    {
        double a = 4.4;
        System.out.println("Rounded Integer :"+rint(a));
        System.out.println("Rounded Value :"+round(a));
        System.out.println("Ceiling Value :"+ceil(a));
        System.out.println("Floor Value :"+floor(a));
        System.out.println("Random Value :"+round(random()*35+1));
        System.out.println("Power Value :"+pow(12,2));
        System.out.println("SQRT Value :"+sqrt(144));
    }
}