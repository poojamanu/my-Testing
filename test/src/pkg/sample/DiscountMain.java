package pkg.sample;
import java.util.Scanner;
public class DiscountMain {
	
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);		
		System.out.println("enter the price of items");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
			
		Discount2 obj=new Discount2(a);
		obj.cal_discount();
		
	}
}
