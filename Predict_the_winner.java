import java.util.*;
class cloth
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
        int c=0,d=0,r=(int)n/2;
        for (int i=0;i<n;i++)
        {
            if (i<r-1)
                c=c+arr[i];
            else
                d=d+arr[i];
        }
        if ((Math.abs(c-d))%4==0)
            System.out.print('X');
        else
            System.out.print('Y');
    }
}