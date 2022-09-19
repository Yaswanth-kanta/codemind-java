import java.util.*;
class digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,d;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            n=n/10;
            if(n==0 && sum>9)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.print(sum);
    }
}