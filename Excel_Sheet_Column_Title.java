import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder res= new StringBuilder();
        while (n>0) 
        {
            int rem=n%26;
            if (rem==0) 
            {
                res.append("Z");
                n= (n/26)-1;
            }
            else
            {
                res.append((char)((rem-1)+'A'));
                n=n/26;
            }
        }
         System.out.println(res.reverse());
    }
}