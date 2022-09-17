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
        int n=sc.nextInt();
        if (cpal(n))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
    