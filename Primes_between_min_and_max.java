import java.util.*;
class primes
{
  public static boolean prime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:a)
            al.add(ele);
        int e=Collections.min(al);
        int d=Collections.max(al);
        int i1=al.indexOf(e);
        int i2=al.indexOf(d);
        if(i1<i2)
        {
            
            for(int i=i1;i<=i2;i++)
            {
                if(prime(al.get(i)))
                    c+=1;
            }
        }
        else
        {
            for(int i=i2;i<=i1;i++)
            {
                if(prime(al.get(i)))
                    c+=1;
            }
        }
        System.out.print(c);
    }
}