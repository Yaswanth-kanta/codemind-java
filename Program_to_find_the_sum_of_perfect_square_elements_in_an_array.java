import java.util.*;
class cloth
{
    public static boolean per(int n)
    {
        double d=Math.sqrt(n);
        if (d==(int)d)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++)
        {
            if (per(arr[i]))
                c+=arr[i];
        }
        System.out.print(c);
    }
}