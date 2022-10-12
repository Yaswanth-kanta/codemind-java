import java.util.*;
class cloth
{
    public static int sma(int arr[],int i)
    {
        for (int j=i-1;j>-1;j--)
        {
            if (arr[j]<arr[i])
                return arr[j];
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print(-1+" ");
        for (int i=1;i<n;i++)
        {
            System.out.print(sma(arr,i)+" ");
        }
    }
}