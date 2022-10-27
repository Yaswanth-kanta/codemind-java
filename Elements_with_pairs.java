import java.util.*;
class pair
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();;
        for (int i=0;i<n;i++)
           System.out.print(arr[i]+" ");
        if (n%2!=0)
            System.out.print(0);
    }
}