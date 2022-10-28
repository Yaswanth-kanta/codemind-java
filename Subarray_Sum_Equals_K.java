import java.util.*;
class sub
{
    public static int sum(int arr[],int r,int l)
    {
        int s=0;
        for(int i=r;i<l;i++)
            s+=arr[i];
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int s=0;
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int r=0;r<n;r++)
        {
            for(int l=r+1;l<=n;l++)
            {
                int k=sum(arr,r,l);
                if(k==v)
                    s++;
            }
        }
        System.out.print(s);
    }
}