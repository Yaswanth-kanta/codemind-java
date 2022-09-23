import java.util.*;
class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a>=3)
        {
            for (int i=1;i<=a;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=a-1;i>0;i--)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
            System.out.print("The pattern is not possible");
    }
}