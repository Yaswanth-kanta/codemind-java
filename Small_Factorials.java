import java.util.*;
class sam 
{
    public static int fac(int n)
    {
        int p=1;
        for (int i=2;i<=n;i++)
            p=p*i;
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            System.out.println(fac(n));
        }
    }
}
