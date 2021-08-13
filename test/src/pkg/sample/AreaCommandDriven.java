package pkg.sample;
import java.util.*;

public class AreaCommandDriven {
	double area;
	public void area(int r)
	{
		area=3.14*r*r;
		System.out.println("area of circle is "+area);
	}
	public void area(int l,int b)
	{
		area=l*b;
		System.out.println("area of rectangle is "+area);
	}
	public void area(float a)
	{
		area=a*a;
		System.out.println("area of square is "+area);
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		AreaCommandDriven obj=new AreaCommandDriven();
		while(true)
		{
		System.out.println("choose the shape to find area");
		System.out.println("1.CIRCLE\n2.RECTANGLE\n3.SQUARE\n4.EXIT");
		int n=s.nextInt();
		switch(n)
		{
		case 1: System.out.println("enter radius of circle");
				int r=s.nextInt();
				obj.area(r);
				break;
		case 2:	System.out.println("enter length and breadth of rectangle");
				int l=s.nextInt();
				int b=s.nextInt();
				obj.area(l, b);
				break;
		case 3:	System.out.println("enter the side of square ");
				float a=s.nextFloat();
				obj.area(a);
				break;
		case 4: break;
		default: System.out.println("invalid option");
		}
		if(n==4)
			break;
		}
	}

}
