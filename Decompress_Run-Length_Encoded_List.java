import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=0;
        for (int i=0;i<n;i+=2)
        {
            int c=arr[i];
            while(c>0)
            {
                System.out.print(arr[i+1]+" ");
                c-=1;
            }
        }
    }
}