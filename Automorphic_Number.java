import java.util.*;
class auto{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=((int)Math.log10(m))+1;
        if(m==((m*m)%(int)Math.pow(10,n)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}