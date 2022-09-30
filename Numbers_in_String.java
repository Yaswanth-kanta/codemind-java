import java.util.*;
import java.lang.String;
class vow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int su=0;
        for (int i=0;i<s.length();i++)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                su+=s.charAt(i)-'0';
            }
        }
        System.out.print(su);
    }
}