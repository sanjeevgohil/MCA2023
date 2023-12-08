//Example of Gregorian calendar
import java.util.*;
class J79
{
    public static void main(String args[])
    {
        GregorianCalendar c1 = (GregorianCalendar) GregorianCalendar.getInstance();
    
        System.out.println("Year is :"+c1.get(c1.YEAR));
        System.out.println("Month is :"+c1.get(c1.MONTH)+1);
        System.out.println("Day is :"+c1.get(c1.DAY_OF_MONTH));
        System.out.println("Leep Year is :"+c1.isLeapYear(c1.get(GregorianCalendar.YEAR)));
    }
}