import java.util.*;
class sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for (int ele:arr)
        {
            if (ele%2==0)
                System.out.print(ele+" ");
        }
        for (int ele:arr)
        {
            if (ele%2!=0)
                System.out.print(ele+" ");
        }
    }
}