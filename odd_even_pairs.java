import java.util.*;
class pairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
            b[i]=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer> ();
        ArrayList<Integer> al1=new ArrayList<Integer> ();
        for(int ele:b)
        {
            if(ele%2!=0)
                al.add(ele);
            else
                al1.add(ele);
        }
        ArrayList<Integer> al3=new ArrayList<Integer> ();
        al3.add(al.size());
        al3.add(al1.size());
        int c=Collections.min(al3);
        int d=Collections.max(al3);
        ArrayList<Integer> al2=new ArrayList<Integer> ();
        for(int i=0;i<c;i++)
        {
            al2.add(al.get(i));
            al2.add(al1.get(i));
        }
        if(al.size()>c)
        {
            for(int i=c;i<d;i++)
                al2.add(al.get(i));
        }
        if(al1.size()>c)
        {
            for(int i=c;i<d;i++)
                al2.add(al1.get(i));
        }
        if(al2.size()%2!=0)
            al2.add(0);
        for(int ele:al2)
            System.out.print(ele+" ");
    }
}