import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c;
        if(n==0 || n==1)
        {
            System.out.print("True");
        }
        else
        {
            a=0;
            b=1;
            c=a+b;
            while(c<n)
            {
                a=b;
                b=c;
                c=a+b;
            }
            if(c==n)
            {
                System.out.print("True");
            }
            else
            {
                System.out.print("False");
            }
        }
    }
}