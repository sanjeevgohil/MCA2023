//exception handling(try catch finally block)
class J64
{
    public static void main(String args[])
    {
        System.out.println("Program is Start");
        int a1=10,b=0,c=0;
        try{
            c = a1/b;
        }
        catch(Exception e)
        {
            System.out.println("Error is:"+e);
        }
        finally
        {
            System.out.println("Program is Stop");
        }
    }
}