import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1.concat(s2);
		String s="";
		char a[]=s3.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		    s+=a[i];
		System.out.println(s);
    }   
    
}