//exception handling(throws keyword)(compile time exception handle)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class J65
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print("Enter Name");
        String nm = br.readLine();
        System.out.println("Name is :"+nm);
    }
}