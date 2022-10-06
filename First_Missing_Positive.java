import java.util.*;
class missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:b)
        {
            al.add(ele);
        }
        int c=Collections.min(al);
        int d=Collections.max(al);
        for(int i=1;i<=d+1;i++)
        {
            if (i==0)
            {
                continue;
            }
            if(al.contains(i))
            {
                continue;
            }
            else
            {
                System.out.print(i);
              
                break;
            }
        }
    }
    
}