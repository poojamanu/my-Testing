package pkg.sample;
import java.util.*;
public class Address {
	int house_no,pin;
	String street,city;
	StudentBasic sb;
	Address()
	{
		Scanner s=new Scanner(System.in);
		sb=new StudentBasic();
		System.out.println("enter the house number");
		house_no=s.nextInt();
		System.out.println("enter the street name");
		street=s.next();
		System.out.println("enter the city");
		city=s.next();
		System.out.println("enter the pin");
		pin=s.nextInt();
		
	}
	void display()
	{  
		System.out.println("student name:"+sb.name);
		System.out.println("student id  :"+sb.id);
		System.out.println("house no:  "+house_no);
		System.out.println("street  :  "+street);
		System.out.println("city    :  "+city);
		System.out.println("pin     :  "+pin);
		
		
	}  
	public static void main(String[] args) {
		Address add=new Address();
		add.display();
		
		
	}

}
