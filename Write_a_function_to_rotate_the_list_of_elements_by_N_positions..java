import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
            ar.add(sc.nextInt());
        int r=sc.nextInt();
        Collections.rotate(ar,r);
        for (int ele:ar)
            System.out.print(ele+" ");
    }
}