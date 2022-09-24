import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n) 
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
		    System.out.print("YES");
        else
		    System.out.print("NO");
    }
}
