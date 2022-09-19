import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int x=0,y=0,c=0,d=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]==k)
            {
                x+=i;
                c+=1;
                break;
            }
        }
        for (int j=n-1;j>-1;j--)
        {
            if (arr[j]==k)
            {
                y+=j;
                d+=1;
                break;
            }
        }
        if (c>0 && d>0)
        {
            System.out.print(x+" "+y);
        }
        else if (c>0 && d==0)
        {
            System.out.print(x+" "+-1);
        }
        else if (c==0 && d>0)
        {
            System.out.print(-1+" "+y);
        }
        else if (c==0 && d==0)
        {
            System.out.print(-1+" "+-1);
        }
    }
}
                

