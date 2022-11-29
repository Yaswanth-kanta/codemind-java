import java.util.*;
class split
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c1=0,c2=0,r=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='R')
                c1+=1;
            else
                c2+=1;
            if (c1==c2)
                r+=1;
        }
        System.out.print(r);
    }
}