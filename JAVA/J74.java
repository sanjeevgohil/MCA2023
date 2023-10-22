//Example of Synchronization of Thread
class Callthread
{
    synchronized public void runthread(String nm)
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
class Th1 implements Runnable
{
    String nm;
    Thread t;
    Callthread cth;
    public Th1(String nm,Callthread cth)
    {
        this.nm = nm;
        this.cth = cth;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        cth.runthread(nm);
    }    
}
class J74
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Callthread cth = new Callthread();
        Th1 th1 = new Th1("First",cth);
        Th1 th2 = new Th1("Second",cth);
        Th1 th3 = new Th1("Third",cth);
        System.out.println("Program Stop");
    }
}