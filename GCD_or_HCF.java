import java.util.*;
class Sam 
{
    public static int gcd(int a, int b)
    {
        if (a==0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(gcd(n,m));
    }
}
        