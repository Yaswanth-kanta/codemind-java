import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    StringBuffer st=new StringBuffer("");
	    for (int i=0;i<s.length();i++)
	    {
	        st.append(Character.toLowerCase(s.charAt(i)));
	    }
	    System.out.print(st);
    }
}