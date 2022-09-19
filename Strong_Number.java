import java.util.*;
class strong
{
    public static int st(int r)
    {
        int z=1;
        for(int i=2;i<=r;i++)
        {
            z=z*i;
        }
        return z;
    }
    public static boolean res(int n)
    {
       int r,s=0;
       int t=n;
       while (n!=0)
       {
           r=n%10;
           s=s+st(r);
           n=n/10;
       }
       if (s==t)
       {
           return true;
       }
       return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (res(n))
            System.out.println("The number"+" "+n+" "+"is a strong number");
        else
            System.out.println("The number"+" "+n+" "+"is not a strong number");
    }
}