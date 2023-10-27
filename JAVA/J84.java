//Example of String Buffer
class J84
{
    public static void main(String args[])
    {
       StringBuffer s1 = new StringBuffer("Computer Department");
       System.out.println("String Buffer Capasity :"+s1.capacity());
       StringBuffer s2 = new StringBuffer(" Junagadh");
       StringBuffer s3 = new StringBuffer("Science ");
       System.out.println("String is :"+s1+" String Length: "+s1.length());
       s1.insert(9,s3);
       System.out.println("String is :"+s1+" String Length: "+s1.length());
       s1.append(s2);
       System.out.println("String is :"+s1+" String Length: "+s1.length());

       System.out.print("String Reverse :");
       System.out.println(s1.reverse());
       System.out.println(s1.reverse());
       
       System.out.println("Delete Character At :"+s1.deleteCharAt(9));
       System.out.println("Delete Character :"+s1.delete(9,15));
    }
}