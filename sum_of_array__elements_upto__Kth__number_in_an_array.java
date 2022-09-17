import java.util.*;
class k
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
        int k=sc.nextInt();
        int s=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]!=k)
            {
                s=s+arr[i];
            }
            else
                break;
        }
        System.out.println(s+k);
    }
}