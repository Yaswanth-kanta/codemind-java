import java.util.*;
class Sam 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int r,c=0;
        while (n!=0)
        {
            r=n%10;
            arr.add(r);
            n=n/10;
        }
        for (int ele:arr)
        {
            if (Collections.frequency(arr,ele)>1)
            {
                c=1;
                break;
            }
        }
        if (c==1)
            System.out.print("Not Unique Number");
        else
            System.out.print("Unique Number");
    }
}
        