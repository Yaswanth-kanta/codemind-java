import java.util.*;
class num
{
    public static boolean ev(int i)
    {
        String s=String.valueOf(i);
        int r=s.length();
        if (r%2==0)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for (int i=0;i<n;i++)
        {
            if (ev(arr[i]))
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}