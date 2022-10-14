import java.util.*;
class cp{
    public static boolean prm(int vk){
        int r=0;
        for(int i=1;i<=vk;i++){
            if(vk%i==0){
                r++;
            }
        }
        if(r==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int v=vk,k=0;
        while(vk>0){
            k=k*10+(vk%10);
            vk/=10;
        }
        if(prm(v)){
            if(prm(k)){
                System.out.println("circular prime");
            }
            else{
                System.out.println("prime but not a circular prime");
            }
        }
        else{
            System.out.println("not prime");
        }
    }
}