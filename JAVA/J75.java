//Example of vector class
import java.util.*;
class J75
{
    public static void main(String args[])
    {
        Vector v1 = new Vector();
        v1.addElement(10);
        v1.addElement(new Integer(20));
        v1.addElement(new Float(20.30));
        v1.addElement(new String("Sanjeev"));
        v1.addElement(new Long(12000));
        v1.addElement(new Double(2010.30545));
        System.out.println(v1);

        String s1 = new String("Gohil");
        v1.insertElementAt(s1,3);
        System.out.println(v1);

        v1.removeElementAt(2);
        System.out.println(v1);
    }
}