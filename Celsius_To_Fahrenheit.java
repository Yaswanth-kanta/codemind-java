import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        double f;
        a=sc.nextFloat();
        f=32+(a*9/5);
        System.out.format("%.2f",f);
    }
}
