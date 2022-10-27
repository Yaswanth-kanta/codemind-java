import java.util.*;
class sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int [n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(n%2==0)
        {
            for(int i=0;i<(int)n/2;i++)
                System.out.print(a[i]+" "+a[n-i-1]+" ");
        }
        
        else
        {
            for(int i=0;i<(int)n/2;i++)
                System.out.print(a[i]+" "+a[n-i-1]+" ");
            System.out.print(a[(n/2)]+" "+"0");
        }
    }
}