import java.util.*;
class sample
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int [n][m];
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                if (arr[j][i]>c)
                    c=arr[j][i];
            }
            System.out.println(c);
            c=0;
        }
    }
}