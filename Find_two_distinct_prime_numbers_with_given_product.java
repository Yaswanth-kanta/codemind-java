import java.util.*;
class prime
{
    public static boolean pri(int n)
    {
        if (n==1 || n==0)
        {
            return false;
        }
        for (int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,f=0,s=0;
        for (int i=2;i<n;i++)
        {
            for (int j=2;j<n;j++)
            {
                if (pri(i) && pri(j))
                {
                    if ((i*j)==n)
                    {
                        s=i;
                        f=j;
                        c+=1;
                        break;
                    }
                }
            }
        }
        if (c==0)
            System.out.println(-1);
        else
            System.out.println(f+" "+s);
    }
}