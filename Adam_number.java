import java.util.*;
class an{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=n*n,x=0;
        while(n>0){
            int r=n%10;
            x=x*10+r;
            n=n/10;
        }
        int a=x*x,k=0;
        while(a>0){
            int b=a%10;
            k=k*10+b;
            a=a/10;
        }
        if(v==k){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}