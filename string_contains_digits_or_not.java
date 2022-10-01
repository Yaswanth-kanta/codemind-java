import java.util.*;
class digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=0;
            sc.nextLine();
            String s=sc.next();
             for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(Character.isDigit(ch))
                {
                    b+=1;
                }
            }
            if(b>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
           
            
        }
    }
}