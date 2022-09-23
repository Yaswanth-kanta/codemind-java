import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=a-2*b;
        if(a==0 && b%2==0)
            System.out.print("YES");
        else if (a==0 && b%2!=0)
            System.out.print("NO");
        else if(res%2==0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}