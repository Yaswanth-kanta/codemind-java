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
        int e=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]%2==0)
                e+=1;
        }
        System.out.print(e+" "+(n-e));
    }
}