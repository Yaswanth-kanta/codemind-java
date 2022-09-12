import java.util.Scanner;
class bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int c;
        double d=1,e=0,f=0;
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextInt();
        if(c<=199)
        {
            d=1.20*c;
        }
        if(c>=200 && c<400)
        {
            d=1.50*c;
        }
        if(c>=400 && c<600)
        {
            d=1.80*c;
        }
        if(c>=600)
        {
            d=2.00*c;
        }
        if(d>400)
        {
            e=(d*(15.0/100));
        }
        if(e>100)
        {
            f=d+e;
        }
        else
        {
            f=d+100;
        }
        System.out.printf("%.2f",f);
    }
}