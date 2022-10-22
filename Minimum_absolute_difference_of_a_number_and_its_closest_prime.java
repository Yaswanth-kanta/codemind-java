import java.util.*;
class sample{
    public static boolean prime(int n){
        for(int i=2;i<=(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)){
            System.out.println(0);
        }
        else{
            int a=n-1,b=n+1;
            for(int i=a;i>0;i--){
                if(prime(i)){
                    a=i;
                    break;
                }
            }
            for(int i=b;i>0;i++){
                if(prime(i)){
                    b=i;
                    break;
                }
            }
            System.out.println(Math.min(n-a,b-n));
        }
    }
}