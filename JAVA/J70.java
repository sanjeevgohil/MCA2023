//parrall Thread
class Th1 extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                Thread.sleep(1000);
                System.out.println("TH1 Number is :"+i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }    
}
class Th2 extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                Thread.sleep(1000);
                System.out.println("TH2 Number is :"+i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }    
}
class J70
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Th1 t1 = new Th1();
        Th2 t2 = new Th2();
        t1.start();
        t2.start();
        System.out.println("Program Stop");
    }
}