import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int ci=p*t*r/100;
        System.out.print(ci);
    }
}