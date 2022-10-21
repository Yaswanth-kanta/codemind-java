import java.util.*;
class fir
{
    public static boolean res(char a,String b)
    {
        int c=0;
        for (int i=0;i<b.length();i++)
        {
            if (b.charAt(i)==a)
                c+=1;
        }
        if (c==1)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean f=false;
        for (int i=0;i<s.length();i++)
        {
            if (res(s.charAt(i),s))
            {
                System.out.print(i);
                f=true;
                break;
            }
        }
        if (f==false)
            System.out.print(-1);
    }
}