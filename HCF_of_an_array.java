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
        int gcd=arr[0];
        int j=1,i=1;
        while(j<n)
        {
            if(arr[j]%gcd==0)
            {
                j++;
            }
            else
            {
                gcd=arr[j]%gcd;
                i++;
            }
        }
        System.out.print(gcd);
    }
}