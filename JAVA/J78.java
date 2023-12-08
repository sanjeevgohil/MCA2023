//Example of calendar
import java.util.*;
class J78
{
    public static void main(String args[])
    {
        Calendar c1 = Calendar.getInstance();
        System.out.println("Year is :"+c1.get(c1.YEAR));
        System.out.println("Month is :"+c1.get(c1.MONTH)+1);
        System.out.println("Day is :"+c1.get(c1.DAY_OF_MONTH));
    }
}