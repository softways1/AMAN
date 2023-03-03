public class Automorphic 
{
    public static void main(String args[])
    {
        int num1=625;
        int num2=num1*num1;
        String str1=Integer.toString(num1);
        String str2=Integer.toString(num2);
        boolean test=str2.endsWith(str1);
        if(test)
        {
            System.out.println("AUTOMORPHIC NUMBER");
        }
        else
        {
            System.out.println("NOT AUTOMORPHIC NUMBER");
        }
    }
}
