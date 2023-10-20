//exception handling(throw keyword)(user define exception handle)
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}
class J66
{
    public static void main(String args[])
    {
        int age =1;
        try{
            if(age>18)
            {
                System.out.println("Welcome You Are Valid");
            }
            else{
                throw new InvalidAgeException("Not Valid");
            }
        }
        catch(InvalidAgeException ex){
            System.out.println(ex);
        }

    }
}