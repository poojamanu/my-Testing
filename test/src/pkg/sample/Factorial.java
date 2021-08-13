package pkg.sample;
import java.util.*;
public class Factorial {
	int num,fact;
	Factorial(int a)
	{
		num=a;
	}
	public void fact(int num)
	{
		fact=1;
		for(int i=1;i<num;i++)
		{
			fact=fact*(i+1);
		}
		this.display();
	}
	public void display()
	{
		System.out.println("factorial of "+num + " is:"+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any num");
		int n=s.nextInt();
		Factorial f=new Factorial(n);
		f.fact(n);

	}

}
