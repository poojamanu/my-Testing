package pkg.sample;

import java.util.Scanner;

public class Employee1 {
	long basic,deduct,bonus;
	public void get_salary()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the basic salary");
		basic=s.nextLong();
		System.out.println("enter amount to deduct");
		deduct=s.nextLong();
		System.out.println("enter the bonus amount");
		bonus=s.nextLong();
	}

}
