//runnable interface
class Th implements Runnable
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                Thread.sleep(1000);
                System.out.println("Number is :"+i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }    
}
class J69
{
    public static void main(String args[])
    {
        System.out.println("Program Start");
        Th t1 = new Th();       //object of interface
        Thread t = new Thread(t1); // object of Thread class
        t.start();
        System.out.println("Program Stop");
    }
}