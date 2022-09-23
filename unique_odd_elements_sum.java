import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        int sum=0;
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    if(c==1)
                    {
                        if(arr[i]%2!=0)
                        {
                            sum+=arr[i];
                        }
                    }
                    if(j > i)
                        arr[j]=0;
                }
            }
        }
        System.out.println(sum);
    }
}