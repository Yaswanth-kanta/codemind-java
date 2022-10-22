import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] arr1=new int [n];
        int [] arr2=new int [m];
        for (int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        for (int i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        for (int ele:arr1)
            a1.add(ele);
        ArrayList<Integer> a2=new ArrayList<Integer>();
        for (int ele:arr2)
            a2.add(ele);
        
        for (int ele:a1){
            if (a2.contains(ele)==false)
                System.out.print(ele+" ");
        }
        for (int ele:a2){
            if (a1.contains(ele)==false)
                System.out.print(ele+" ");
        }
    }
}