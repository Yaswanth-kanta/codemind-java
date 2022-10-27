import java.util.*;
class minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
            b[i]=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int x=0;
        for(int i:b)
        {
            if(i<c || i>d)
                x+=i;
        }
        System.out.print(x);
    }
}