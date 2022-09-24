import java.util.*;
class sum
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
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if (pa(n))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}