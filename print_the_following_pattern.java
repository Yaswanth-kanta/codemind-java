import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}