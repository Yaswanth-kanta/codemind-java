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
    public static boolean pa(int i)
    {
        int t,r,s=0;
        t=i;
        while(i!=0)
        {
            r=i%10;
            s=s*10+r;
            i=i/10;
        }
        if (s==t)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        int i=z+1;
        while (i!=0)
        {
            if (pri(i))
            {
                if(pa(i))
                {
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}