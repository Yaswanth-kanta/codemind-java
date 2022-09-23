import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        double c;
        a=sc.nextFloat();
        c=(float)5/9*(a-32);
        System.out.format("%.2f",c);
    }
}
