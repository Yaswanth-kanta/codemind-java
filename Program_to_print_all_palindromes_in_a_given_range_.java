import java.util.*;
class pal
{
    public static boolean pa(int i)
    {
        int t,r,s=0;
        t=i;
        while(i!=0)
        {
            r=i%10;
            s=s*10+r;
            i=i/10;
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            if (pa(i))
                System.out.print(i+" ");
        }
    }
}