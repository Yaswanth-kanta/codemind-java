import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for (int i=0;i<n;i++)
                ar.add(sc.nextInt());
            int c=0;
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    if (i!=j)
                    {
                        if (ar.contains(ar.get(i)+ar.get(j)))
                            c+=1;
                    }
                }
            }
            if (c>0)
                System.out.println((int)c/2);
            else
                System.out.println(-1);
        }
    }
}