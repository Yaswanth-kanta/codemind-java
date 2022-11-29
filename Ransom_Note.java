import java.util.*;
class note
{
    public static boolean res(StringBuilder st,char x)
    {
        for (int i=0;i<st.length();i++)
        {
            if (x==st.charAt(i))
                return true;
        }
        return false;
    }
    public static int res1(StringBuilder st,char x)
    {
        int i;
        for (i=0;i<st.length();i++)
        {
            if (x==st.charAt(i))
                break;
        }
        return i;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder st=new StringBuilder();
        for (int i=s.indexOf(' ')+1;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
                st.append(s.charAt(i));
            else
                break;
        }
        int c=0;
        for (int i=0;i<s.indexOf(' ');i++)
        {
            if (res(st,s.charAt(i)))
            {
               st.deleteCharAt(res1(st,s.charAt(i)));
               c+=1;
            }
        }
        if (c==s.indexOf(' ')-1)
            System.out.print("False");
        else
            System.out.print("True");
    }
}