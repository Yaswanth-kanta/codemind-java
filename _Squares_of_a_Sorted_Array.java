import java.util.*;
class cloth
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
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            ar.add((int)arr[i]*arr[i]);
        }
        Collections.sort(ar);
        for (int ele:ar)
        {
            System.out.print(ele+" ");
        }
        
    }
}
