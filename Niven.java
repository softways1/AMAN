import java.util.*;
public class Niven 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        int sum=0;
        for(int t=num1;t>0;t/=10)
        {
            int rem=t%10;
            sum+=rem;
        }
        boolean test=(num1%sum==0)?true:false;
        if(test)
        {
            System.out.println("NIVEN NUMBER");
        }
        else
        {
            System.out.println("NOT NIVEN NUMBER");
        }
    }
}
