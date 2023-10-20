//try catch block(runtime exception handle)
class J61
{
    public static void main(String args[])
    {
        int a=10;
        int b=0;
        int c=0;
        System.out.println("Program is Start");
        try{
            c=a/b;
        }
        catch(Exception e)
        {
            System.out.println("Error is  :"+e);
        }
        System.out.println("Answer is :"+c);
        System.out.println("Program is Stop");
    }
}