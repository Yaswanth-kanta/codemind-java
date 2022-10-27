import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
            b[i]=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:b)
            al.add(ele);
        ArrayList<Integer> al1=new ArrayList<Integer>();
        for(int i:al)
        {
            if(al1.contains(i))
                continue;
            else
                al1.add(i);
        }
        int c=0,d=0;
        float e;
        ArrayList<Integer> al2=new ArrayList<Integer>();
        for(int i:al1)
         {
             if(i==Collections.frequency(al,i))
                 al2.add(i);
         }
         if(al2.isEmpty())
             System.out.print(-1);
         else
             System.out.print(Collections.min(al2)+" "+Collections.max(al2));
    }
}