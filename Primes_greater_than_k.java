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
        int si=sc.nextInt();
        int [] arr=new int [si];
        int c=0;
        for (int i=0;i<si;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int i=0;i<si;i++)
        {
            if (pri(arr[i]))
            {
                if (arr[i]>=k)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}