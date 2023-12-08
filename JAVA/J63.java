//exception handling(multiple try catch block)
class J63
{
    public static void main(String args[])
    {
        System.out.println("Program is Start");
        int a[] = new int[5];
        int a1=10,b=20,c=0;
        try{
            c = a1/b;
            a[5] = 10;
            System.out.println("Value of A[0] is :"+a[5]);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Error is:"+e);
            }
        catch(Exception e)
        {
            System.out.println("Error is:"+e);
        }
        System.out.println("Program is Stop");
    }
}