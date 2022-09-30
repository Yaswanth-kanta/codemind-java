import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int c=0;
		for (int i=0;i<n.length();i++)
		{
		    if (Character.isDigit(n.charAt(i)))
		        c+=1;
		}
		if (c>0)
		    System.out.print("Contains" + " " +c+" " +"digit");
		else
		    System.out.print("Doesn't "+"contain "+"digit");
    }
}