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
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            a.add(arr[i]);
        }
        HashSet<Integer> ar=new HashSet<Integer>();
        for (int i=0;i<n;i++)
        {
            ar.add(arr[i]);
        }
        int c=0;
        int b=0;
        for (int ele:ar)
        {
            b=Collections.frequency(a,ele);
            c+=(int)b/2;
            b=0;
        }
        System.out.print(c);
    }
}