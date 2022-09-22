import java.util.*;
class dis
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        String s=String.valueOf(n);
        int i=s.length();
        int su=0,r;
        while(n>0)
        {
            r=n%10;
            su=su+(int)Math.pow(r,i);
            n=n/10;
            i--;
        }
        if (t==su)
            System.out.println("True");
        else
            System.out.println("False");
    }
}