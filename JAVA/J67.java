//thread
class Th extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("Number is :"+i);
        }
    }    
}
class J67
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Th t1 = new Th();
        t1.start();
        System.out.println("Program Stop");
    }
}