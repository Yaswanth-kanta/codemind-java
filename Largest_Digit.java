import java.util.*;
class dig
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,r;
        while (n>0)
        {
            r=n%10;
            if (r>c)
                c=r;
            n=n/10;
        }
        System.out.print(c);
    }
}