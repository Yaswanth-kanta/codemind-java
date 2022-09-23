import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,p=1,r;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        System.out.print(p-s);
    }
}