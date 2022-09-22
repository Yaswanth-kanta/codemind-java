import java.util.*;
class miss
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int [] arr=new int[n];
            for (int j=0;j<n-1;j++)
            {
                arr[j]=sc.nextInt();
            }
            int s=0;
            for (int j=0;j<n-1;j++)
            {
                s=s+arr[j];
            }
            int r=(n*(n+1))/2;
            System.out.println(r-s);
        }
    }
}