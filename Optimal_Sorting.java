import java.util.*;
class sample
{
    public static int sort(int v[],int n)
    {
        int t;
        int [] r=new int [n];
        for(int k=0;k<n;k++)
            r[k]=v[k];
        for(int j=0;j<n-1;j++)
        {
            for(int k=0;k<n-1;k++)
            {
                if(v[k]>v[k+1])
        	    {
            	    t=v[k+1];
            	    v[k+1]=v[k];
            	    v[k]=t;
        	    }
            }
        }
        t=0;
        for(int k=0;k<n;k++)
        {
            if(v[k]!=r[k])
                t=1;
        }
        if(t==1)
            t=v[n-1]-v[0];
        return t;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int [] arr=new int [100];
            for(int k=0;k<n;k++)
                arr[k]=sc.nextInt();
            System.out.println(sort(arr,n));
        }
    }
}