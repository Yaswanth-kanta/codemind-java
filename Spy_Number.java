import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,s=0,p=1;
        while (n>0)
        {
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if (s==p)
            System.out.print("Spy Number");
        else
            System.out.print("Not Spy Number");
    }
}