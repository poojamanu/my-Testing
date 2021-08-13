import java.util.*;
public class ShapeArea {
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
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius of circle");
		int r=s.nextInt();
		System.out.println("enter length and breadth of rectangle");
		int l=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter the side of square ");
		float a=s.nextFloat();
		
		ShapeArea obj=new ShapeArea();
		obj.area(r);
		obj.area(l,b);
		obj.area(a);
	}

}
