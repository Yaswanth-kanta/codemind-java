import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        while (n!=0)
        {
            int r=n%10;
            if (r%2==0)
                e+=1;
            else
                o+=1;
            n/=10;
        }
        if (e>0 && o>0)
            System.out.print("Mixed");
        else if (e>0 && o==0)
            System.out.print("Even");
        else if (e==0 && o>0)
            System.out.print("Odd");
    }
}