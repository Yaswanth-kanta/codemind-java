import java.util.*;
class sample
{
    public static boolean non(String s,char j)
    {
        int c=0;
        for (int i=0;i<s.length();i++)
        {
           if (s.charAt(i)==j)
                c+=1;
        }
        if (c==1)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.next();
            boolean f=false;
            for (int i=0;i<s.length();i++)
            {
                if (non(s,s.charAt(i)))
                {
                    f=true;
                    System.out.println(s.charAt(i));
                    break;
                }
            }
            if (f==false)
                System.out.println(-1);
        }
    }
}
        