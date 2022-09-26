import java.util.*;
class sam
{
    public static boolean fun(int num)
    {
        int i,fc=0;
        for(i=1;i<=num;i++)
	    {
		    if(num%i==0)
		    {
			    fc++;	
		    }	
	    }   
	    if(fc==2)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,c=0,cc=0,temp;
        temp=n;
        if(fun(n))
        {
            while(n!=0)
            {
                d=n%10;
                if(fun(d))
                {
                    cc++;
                }
                n=n/10;
                c++;
            }
            if(c==cc)
            {
                System.out.print("Mega Prime");
            }
            else
            {
                System.out.print("Not Mega Prime");
            }
        }
        else
        {
            System.out.print("Not Mega Prime");
        }
    }
}