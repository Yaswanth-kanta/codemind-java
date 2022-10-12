import java.util.*;
class cloth
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
            ar.add(arr[i]);
        for (int ele:ar)
        {
            if (Collections.frequency(ar,ele)>1)
                System.out.print(ele+" ");
                brek;
        }
    }
}
        