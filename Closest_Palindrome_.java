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
        int t=sc.nextInt();
        int f,s;
        int i=t+1;
        while (true)
        {
            if (cpal(i))
            {
                s=i;
                break;
            }
            else
                i+=1;
        }
        int j=t-1;
        while (true)
        {
            if (cpal(j))
            {
                f=j;
                break;
            }
            else
                j-=1;
        }
        if ((Math.abs(t-s))>(Math.abs(t-f)))
        {
            System.out.println(f);
        }
        else if ((Math.abs(t-s))<(Math.abs(t-f)))
        {
             System.out.println(s);
        }
        else
        {
            System.out.println(f+" "+s);
        }
    }
}
        
        