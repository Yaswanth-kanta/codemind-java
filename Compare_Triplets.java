import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [] arr1=new int [3];
        for (int i=0;i<3;i++)
            arr1[i]=sc.nextInt();
        int [] arr2=new int [3];
        for (int i=0;i<3;i++)
            arr2[i]=sc.nextInt();
        int a=0,b=0;
        for (int i=0;i<3;i++)
        {
            if (arr1[i]>arr2[i])
                a+=1;
            else if (arr1[i]<arr2[i])
                b+=1;
        }
        System.out.print(a+" "+b);
    }
}