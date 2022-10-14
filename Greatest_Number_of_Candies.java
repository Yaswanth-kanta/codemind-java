import java.util.*;
class gnc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int m=arr[0];
        for(int k:arr){
            if(m<k){
                m=k;
            }
        }
        for(int k:arr){
            if((r+k)>=m){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}