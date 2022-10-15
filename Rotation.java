import java.util.*;
class Rotate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int [] arr=new int [n];
            for (int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for (int j=0;j<n;j++)
            {
                ar.add(arr[j]);
            }
            int c=0;
            Collections.rotate(ar,r);
            for (int el:ar)
            {
                c+=1;
                if (c==n)
                    System.out.print(el);
                else
                    System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}