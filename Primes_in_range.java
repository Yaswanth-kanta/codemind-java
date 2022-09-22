import java.util.*;
class pal
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,i=a;
        while(i<=b)
        {
            if (pri(i))
            {
                c+=1;
            }
            i++;
        }
        System.out.println(c);
    }
}