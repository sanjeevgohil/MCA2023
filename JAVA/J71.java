//Example of join in Thread
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
class J71
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Th1 t1 = new Th1();
        t1.start();
        try{
            t1.join();
        }catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("Program Stop");
    }
}