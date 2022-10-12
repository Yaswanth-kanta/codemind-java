import java.util.*;
class cloth
{
    public static int pro(int arr[],int i)
    {
        int p=1;
        for (int j=0;j<arr.length;j++)
        {
            if (j!=i)
                p*=arr[j];
        }
        return p;
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
            System.out.print(pro(arr,i)+" ");
        }
    }
}