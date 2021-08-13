package pkg.sample;

import java.util.*;
public class Student
{
	String name;
	int mark[],total;
	Student()
	{
		mark=new int[3];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name:");
		this.name=s.next();
		System.out.println("enter marks");
		for(int i=0;i<3;i++)
			mark[i]=s.nextInt();
	}
	public  int total_mark()
	{
		for(int i=0;i<3;i++)
			total+=mark[i];
		//this.grade();
		return total;
	}
	public void grade(int total)
	{
		int percent=(total*100)/300;
        System.out.println(percent);
		if(percent>=80&&percent<=100)
			System.out.println(this.name +" got grade A");
		else if(percent>=70 && percent<80)
			System.out.println(this.name +" got grade B");
		else if(percent>=60 && percent<70)
			System.out.println(this.name +" got grade C");
		else if(percent>=40 && percent<60)
			System.out.println(this.name +" got grade D");
		else
			System.out.println("failed");
	}
	public static void main (String args[])
	{
		int total1,total2;
		System.out.println("enter details of student 1");
		Student obj1=new Student();
		total1=obj1.total_mark();
		
		System.out.println("enter details of student 2");
		Student obj2=new Student();
		total2=obj2.total_mark();
		
		System.out.println("name of student1 "+obj1.name);
		System.out.println("total mark of student1 "+total1);
		obj1.grade(total1);
		System.out.println("name of student2 "+obj2.name);
		System.out.println("total mark of student2 "+total2);
		obj2.grade(total2);
		
	}
}