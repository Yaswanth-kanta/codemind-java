import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for (int i=0;i<m+n;i++)
                arr.add(sc.nextInt());
            Collections.sort(arr);
            for (int i=0;i<n+m;i++)
            {
                if (i!=m+n-1)
                    System.out.print(arr.get(i)+" ");
                else
                    System.out.print(arr.get(i));
            }
            System.out.println();
        }
    }
}