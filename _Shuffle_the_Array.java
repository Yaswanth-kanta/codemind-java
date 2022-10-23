import java.util.*;
class shuffle
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
        int c=sc.nextInt();
        for (int i=0;i<c;i++)
        {
            System.out.print(b[i]+" ");
            System.out.print(b[i+c]+" ");
        }
    }
}