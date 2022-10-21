import java.util.*;
class po
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double l,u,x=0;
        int s=0;
        for(int i=1;i<n;i++)
        {
            x=Math.pow(2,i);
            if(n<=x)
            {
                s=i;
                break;
            }
        }
        l=Math.pow(2,s-1);
        u=Math.pow(2,s);
        if(n==x)
            System.out.print(0);
        else if(n-l>u-n)
            System.out.print((int)(u-n));
        else
            System.out.print((int)(n-l));
    }
}