import java.util.*;
class sam
{
    public static void res(String s,int n)
    {
        String z1="aeiouAEIOU";
        if (z1.indexOf(s.charAt(0))>-1)
        {
            s+="ma";
            for (int i=0;i<=n;i++)
                s+="a";
            System.out.print(s+" ");
        }
        else
        {
            StringBuilder st=new StringBuilder();
            st.append(s);
            char t=st.charAt(0);
            st.deleteCharAt(0);
            st.append(t);
            st.append("ma");
            for (int i=0;i<=n;i++)
                st.append("a");
            System.out.print(st+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder st=new StringBuilder();
        st.append(s);
        String str[]=s.split(" ");
        for (int i=0;i<str.length;i++)
            res(str[i],i);
    }
}