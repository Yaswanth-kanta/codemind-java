import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        HashSet<Integer> a =new HashSet<Integer>();
        for (int i=0;i<n;i++)
            a.add(sc.nextInt());
        if (a.size()<3)
            System.out.print("It is not possible");
        else
        {
            for (int ele:a)
                ar.add(ele);
            Collections.sort(ar);
            System.out.print(ar.get(a.size()-3));
        }
    }
}