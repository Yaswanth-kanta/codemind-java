import java.util.*;
class hp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        while(n>0){
            int r=n%10;
            s+=r*r;
            n/=10;
            if(n==0 && s>9){
                n=s;
                s=0;
            }
        }
        if(s!=1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}