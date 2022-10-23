import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
            arr.add(sc.nextInt());
        for (int i=0;i<r;i++) 
        {
            int t=arr.get(0);
            for (int j=0;j<n-1;j++) 
            {
                arr.set(j,arr.get(j+1));
            }
            arr.set(n-1,t);
        }
        for (int ele:arr)
            System.out.print(ele+" ");
    }
}