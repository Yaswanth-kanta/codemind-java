import java.util.*;
class sum
{
    public static boolean pri(int i)
    {
        if (i<2)
            return false;
        for (int j=2;j<=(int)Math.sqrt(i);j++)
        {
            if (i%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (pri(n))
            System.out.print("prime");
        else
            System.out.print("not a prime");
    }
}