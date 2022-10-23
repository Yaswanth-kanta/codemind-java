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
        for (int ele:ar)
            a.add(ele);
        Collections.sort(a);
        int [] a1=new int [a.size()];
        int i=0;
        for (int ele:a)
            a1[i++]=ele;
        if (a.size()>=3)
            System.out.print(a1[a1.length-3]);
        else
        {
            if (a1[1]>a1[0])
                System.out.print(a1[1]);
            else
                System.out.print(a1[0]);
        }
    }
}