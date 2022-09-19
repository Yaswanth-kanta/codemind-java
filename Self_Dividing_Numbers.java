import java.util.*;
class ugly
{
    public static boolean sel(int n){
        int t=n,r;
        while (n!=0){
            r=n%10;
            if (r==0){
                return false;
            }
            if (t%r!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i<=b;i++){
            if (sel(i)){
                System.out.print(i+" ");
            }
        }
    }
}