import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int [30];
        int i=0,d;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            a[i]=d;
            i++;
        }
        for(int j=i;j>=0;j--)
        {
            if(a[j]==6)
            {
                a[j]=9;
                break;
            }
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
}