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
        float c=0;
        for (int i=0;i<n;i++)
        {
            c+=arr[i];
        }
        float d=c/n;
        System.out.format("%.2f",d);
    }
}