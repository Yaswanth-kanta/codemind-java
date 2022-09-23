import java.util.*;
class sum
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
        int c=0;
        for (int i=0;i<n;i++)
        {
            c+=arr[i];
        }
        double d=c/n;
        int e=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]==(int)d)
            {
                System.out.print("True");
                e=1;
                break;
            }
        }
        if (e==0)
            System.out.print("False");
    }
}