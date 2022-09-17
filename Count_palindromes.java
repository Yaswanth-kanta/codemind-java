import java.util.*;
class pal
{
    public static boolean cpal(int n)
    {
        int s=0,r,t=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if (t==s)
        {
            return true;
        }
        return false;
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
            if (cpal(arr[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}