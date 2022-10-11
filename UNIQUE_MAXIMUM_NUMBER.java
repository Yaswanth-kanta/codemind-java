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
            ar.add(arr[i]);
        }
        HashSet<Integer> a=new HashSet<Integer>();
        for (int i=0;i<n;i++)
        {
            a.add(arr[i]);
        }
        int c=-1;
        for (int i=0;i<n;i++)
        {
            for (int ele:a)
            {
                if (Collections.frequency(ar,ele)==1)
                {
                    if (ele>c)
                        c=ele;
                }
            }
        }
        System.out.print(c);
    }
}