import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long i=sc.nextLong();
        long t=i;
        int j=0;
        while(i>0)
        {
            i=i/10;
            j++;
            if(j==10 && i==0)
            {
                j--;
            }
        }
        if(j==9)
            System.out.print("Valid");
        else
            System.out.print("Invalid");
    }
}