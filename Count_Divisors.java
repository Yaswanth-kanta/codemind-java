import java.util.*;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,k,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        k=sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            if (i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }   
}