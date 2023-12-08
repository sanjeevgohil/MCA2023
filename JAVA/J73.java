//Example of Thread implements
class Th1 implements Runnable
{
    String nm;
    Thread t;
    public Th1(String nm)
    {
        this.nm = nm;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                Thread.sleep(1000);
                System.out.println(nm+" Number is :"+i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }    
}
class J73
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Th1 th1 = new Th1("First");
        Th1 th2 = new Th1("Second");
        Th1 th3 = new Th1("Third");
        System.out.println("Program Stop");
    }
}