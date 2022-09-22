import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0,d=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]==1)
            {
                c+=1;
            }
            else
            {
                if (c>d)
                    d=c;
                c=0;
            }
        }
        if (c>d)
            System.out.println(c);
        else
            System.out.println(d);
    }
}