import java.util.*;
class cloth
{
    public static int sma(int arr[],int v,int it)
    {
        int c=0;
        for (int i=0;i<arr.length;i++)
        {
            if ((it!=i)&&(arr[i]<v))
                c+=1;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(sma(arr,arr[i],i)+" ");
        }
    }
}