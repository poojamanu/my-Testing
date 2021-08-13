package pkg.sample;
import java.util.*;

class StudentBasic {
	String name;
	int id;
	StudentBasic()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name");
		name=s.next();
		System.out.println("enter the id");
		id=s.nextInt();
		
	}
	

}
