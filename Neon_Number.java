import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n*n,r,s=0;
        while(d!=0)
        {
            r=d%10;
            s=s+r;
            d=d/10;
        }
        if (s==n)
            System.out.print("Neon Number");
        else
            System.out.print("Not Neon Number");
    }
}