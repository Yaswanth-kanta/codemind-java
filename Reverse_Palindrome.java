import java.util.*;
class code
{
    public static int rev(int n)
    {
        int res=0,d;
        while(n!=0)
        {
            d=n%10;
            res=res*10+d;
            n=n/10;
        }
        return res;
    }
    public static boolean pal(int n)
    {
        int temp=n,rev=0,d;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==temp)
            return true;
        return false;
    }
    public static void fun(int n)
    {
        int x;
        x=rev(n);
        n=n+x;
        if(pal(n))
            System.out.print(n);
        else
            fun(n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        fun(n);
    }
}