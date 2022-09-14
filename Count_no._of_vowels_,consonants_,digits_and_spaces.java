import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,d=0,st=0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='a' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                v+=1;
            }
            else if (s.charAt(i)==' ')
            {
                st+=1;
            }
            else if (s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                d+=1;
            }
            else
            {
                c+=1;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+st);
    }
}