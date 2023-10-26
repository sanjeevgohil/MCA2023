//Example of Wrapper Class
class J81
{
    public static void main(String args[])
    {
        String s = "45";
        int a = 45;
        Integer i1 = new Integer(s);

        System.out.println("Addtion of :"+(i1.intValue()+a));
        System.out.println("Equal To :"+i1.equals(a));
    }
}