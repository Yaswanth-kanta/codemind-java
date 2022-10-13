import java.util.*;
class Sam 
{
    public static int fac(int n)
    {
        int c=0;
        for (int i=2;i*i<=n;i++) 
        {
            if (pri(i)) 
            {
                if (i*i<=n) 
                    c+=1;
            }
        }
        return c;
    }
    public static boolean pri(int n)
    {
        for (int i=2;i*i<=n;i++) 
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        System.out.print(fac(n));
    }
}