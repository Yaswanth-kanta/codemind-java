import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] arr1=new int [n1];
        for (int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        int n2=sc.nextInt();
        int [] arr2=new int [n2];
        for (int i=0;i<n1;i++)
            arr2[i]=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<n1;i++)
            ar.add(arr2[i],arr1[i]);
        for (int ele:ar)
            System.out.print(ele+" ");
    }
}