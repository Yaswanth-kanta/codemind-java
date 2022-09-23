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
        int c=0;
        int k=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if (arr[i]==k)
                c+=1;
        }
        System.out.print(c);
    }
}