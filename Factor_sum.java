import java.util.*;
class sample
{
    public static int fac(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
                c+=i;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] arr=s.split(",",20);
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++)
            ar.add(Integer.valueOf(arr[i]));
        boolean f=false;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int ele:ar)
        {
            if (ar.contains(fac((ele))))
            {
                f=true;
                a.add(ele);
            }
        }
        if (f==false)
            System.out.print(-1);
        else
        {
            Collections.sort(a);
            for (int ele:a)
                System.out.print(ele+" ");
        }
    }
}