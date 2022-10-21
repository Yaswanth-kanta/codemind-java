import java.util.*;
class re
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,r,rev=0;
        if (n<0)
            n=n*(-1);
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if (t>0)
            System.out.print(rev);
        else
        {
            System.out.print("-");
            System.out.print(rev);
        }
    }
}