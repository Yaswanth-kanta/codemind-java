import java.util.*;
class interval
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            if (pri(i)){
                System.out.println(i);
            }
        }
    }
}
    