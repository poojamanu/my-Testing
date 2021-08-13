package pkg.sample;
import java.util.*;
public class Palindrome {
	String word;
	
	public void palin_check(String s)
	{
		String rev="";
		int n=s.length();
		//System.out.println(n);
		
		for (int i=0;i<n;i++)
		{
			 rev=rev+s.charAt(n-1-i);
		}
		//System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println(s+" is palindrome");
		}
		else
			System.out.println(s+" is not palindrome");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter any word");
		String word=s.next();
		Palindrome obj1=new Palindrome();
		obj1.palin_check(word);
		

	}

}
