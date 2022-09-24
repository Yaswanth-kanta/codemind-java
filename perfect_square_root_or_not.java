import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double d=Math.sqrt(n);
        if ((int)d==d)
            System.out.print("True");
        else
            System.out.print("False");
    }
}