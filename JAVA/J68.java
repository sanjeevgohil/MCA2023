//thread with try cathch and sleep method
class Th extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                Thread.sleep(2000);
                System.out.println("Number is :"+i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }    
}
class J68
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Th t1 = new Th();
        t1.start();
        System.out.println("Program Stop");
    }
}