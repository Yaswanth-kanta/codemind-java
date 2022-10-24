import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,t=0;
        int [] arr=new int [n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=a;
            int c=a+b;
            a=b;
            b=c;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>n)
            {
                t=i;
                break;
            }
        }
        if(n-arr[t-1]==arr[t]-n)
            System.out.print(arr[t-1]+" "+arr[t]);
        else if(n-arr[t-1]>=arr[t]-n)
            System.out.print(arr[t]);
        else
            System.out.print(arr[t-1]);
    }
}