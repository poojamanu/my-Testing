package pkg.sample;
import java.util.*;
public class Reverse {
	int rev;
	Reverse(int num)
	{
		this();
		int n=num;
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("reverse of "+num+" is:"+rev);
	}
	Reverse()
	{
		
		System.out.println("finding reverse..");
	}
	public static void main (String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter any num");
		int num=s.nextInt();
		Reverse obj=new Reverse(num);
		
	}

}
