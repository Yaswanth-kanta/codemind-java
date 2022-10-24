import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=0;k<t;k++)
        {
            sc.nextLine();
            String s=sc.next();
            int c=0;
            char a=s.charAt(0);
            for (int i=1;i<s.length();i++)
            {
                if (s.charAt(i)==a)
                    c+=1;
                a=s.charAt(i);
            }
            System.out.println(c);
        }
    }
}