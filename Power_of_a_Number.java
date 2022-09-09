import java.util.*;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,m;
        double r;
        a=sc.nextInt();
        b=sc.nextInt();
        m=sc.nextInt();
        r=((Math.pow(a,b))%m);
        System.out.println((int)(r));
    }
}