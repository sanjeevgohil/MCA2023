//Example of String function

class J82
{
    public static void main(String args[])
    {
        String s1 = "COMPUTER";
        String s2 = new String(" Department");

        System.out.println("String S1 = :"+s1);
        System.out.println("String S2 = :"+s2);

        int l1 = s1.length();
        System.out.println("Length of String S1 = :"+l1);

        String s3 = s1.toLowerCase();
        System.out.println("Lower case String S1 = :"+s3);

        String s4 = s3.toUpperCase();
        System.out.println("Upper case String S1 = :"+s4);

        System.out.println("Equals String = :"+s1.equals(s4));

        String s5 = s1.concat(s2);
        System.out.println("Concatenate String = :"+s5);

        System.out.println("Start Index of t in s2 is :"+s2.indexOf('t'));
        System.out.println("End Index of t in s2 is :"+s2.lastIndexOf('t'));
    }
}