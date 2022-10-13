import java.util.*;
class cloth
{
    public static boolean pri(int n)
    {
        if (n<2)
            return false;
        for (int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int c=0;
            for (int i=2;i<n;i++)
            {
                for (int j=2;j<n;j++)
                {
                    if (i!=j && pri(i)==true && pri(j)==true)
                    {
                        if (i*j==n)
                        {
                            c=1;
                            break;
                        }
                    }
                }
            }
            if (c==0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
        