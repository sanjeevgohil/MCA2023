//Example of HashTable
import java.util.*;
class J83
{
    public static void main(String args[])
    {
        Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
        h1.put(101, "AAA");
        h1.put(102, "BBB");
        h1.put(103, "CCC");
        h1.put(104, "DDD");     
        System.out.println("HashTable :"+h1);   

        h1.remove(102);
        System.out.println("HashTable :"+h1);  
        System.out.println("Get Value of 103 :"+h1.getOrDefault(103, "Not Found"));  
        System.out.println("Get Value of 102 :"+h1.getOrDefault(102, "Not Found")); 
        
        h1.putIfAbsent(104, "EEE");
        System.out.println("HashTable :"+h1);  
    }
}