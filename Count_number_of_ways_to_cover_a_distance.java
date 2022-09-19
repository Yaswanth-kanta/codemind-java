import java.util.*;
class GFG
{
    public static int Rec(int d)
    {   
        if (d<0)
            return 0;
        if (d==0)
            return 1;
        return Rec(d-1)+Rec(d-2)+Rec(d-3);
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println(Rec(d));
    }
}

