import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        HashSet<Integer> ar=new HashSet<Integer>();
        for (int ele:arr)
            ar.add(ele);
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int ele:arr)
            a.add(ele);
        int c=0,r=0;
        for (int ele:ar)
        {
            if (Collections.frequency(a,ele)>c)
            {
                c=Collections.frequency(a,ele);
                r=ele;
            }
        }
        System.out.print(r);
    }
}
        
        