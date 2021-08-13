package pkg.sample;
import java.util.*;

public class Overridechild extends OverrideParent{
	
	@Override
	void add(int a,int b)
	{
		super.add(a,b);
		if(sum%10 == 0)
			System.out.println("number is divisible by 10");
		else
			System.out.println("not divisible by 10");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num1");
		int a=s.nextInt();
		System.out.println("enter num2");
		int b=s.nextInt();
		
		Overridechild obj=new Overridechild();
		obj.add(a, b);
		


	}

}
