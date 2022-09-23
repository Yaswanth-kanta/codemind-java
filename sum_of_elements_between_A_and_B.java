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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for (int j=0;j<n;j++)
        {
            if (arr[j]>=a && arr[j]<=b)
                c+=arr[j];
        }
        System.out.print(c);
    }
}