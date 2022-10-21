import java.util.*;
class lc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l,g=0;
        for(int i=1;i<=n&&i<=m;++i) 
        {
            if(n%i==0 && m%i==0)
                g=i;
        }
        l=(n*m)/g;
        System.out.print(l);
   }
}