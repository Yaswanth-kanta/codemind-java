import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int s=0,s1=0;
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
                s=s+i;
        }
        for (int j=1;j<n1;j++)
        {
            if (n1%j==0)
                s1=s1+j;
        }
        if (s==n1&&s1==n)
            System.out.print("Amicable");
        else
            System.out.print("Not Amicable");
    }
}