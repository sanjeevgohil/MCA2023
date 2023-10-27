//Example of StringTokenizer

import java.util.*;

class J85
{
    public static void main(String args[])
    {
       StringTokenizer s1 = new StringTokenizer("Ruparel Education Pvt. Ltd., Punit Shopping Center, Junagadh.");
       while(s1.hasMoreTokens()){
        System.out.println(s1.nextToken());
       }
    }
}