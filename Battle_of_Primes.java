import java.util.*;
class bahu
{
    public static boolean pri(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=a+b+1;
        int s=0;
        while(i!=0)
        {
            if (pri(i))
            {
                s=i;
                break;
            }
            else
                i+=1;
        }
        System.out.println(s-(a+b));
    }
}