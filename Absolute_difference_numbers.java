import java.util.*;
class abs
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=(int)(Math.log10(p));
        int y=sc.nextInt();
        int v=p%((int)(Math.pow(10,y)));
        int k=p/((int)(Math.pow(10,r-y+1)));
        System.out.print(Math.abs(v-k));
    }
}