import java.util.*;
class sam 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int ele:arr)
            ar.add(ele);
        HashSet<Integer> a=new HashSet<Integer>();
        for (int ele:arr)
            a.add(ele);
        boolean f=false;
        for (int ele:a){
            if (Collections.frequency(ar,ele)==k)
            {
                f=true;
                System.out.print(ele+" ");
            }
        }
        if (f==false)
            System.out.print(-1);
    }
}
