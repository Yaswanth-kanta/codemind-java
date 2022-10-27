import java.util.*;
class oct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int t=Integer.parseInt(s,8);
        String res=Integer.toBinaryString(t);
        System.out.print(res);
    }
}