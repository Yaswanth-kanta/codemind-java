import java.util.*;
import java.lang.String;
class camel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for (int i=0;i<s.length();i++)
        {
            if (Character.isUpperCase(s.charAt(i)))
                c+=1;
        }
        if (Character.isLowerCase(s.charAt(0)))
            System.out.print(c+1);  
        else
            System.out.print(c);
    }
}