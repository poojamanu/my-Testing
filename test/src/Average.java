
public class Average {
	float avg;
	public void average(int a,int b,int c)
	{	
		
		avg=(a+b+c)/3;
		System.out.println("average of integer numbers is "+avg);
	}
	public void average(float a,float b,float c)
	{
		avg=(a+b+c)/3;
		System.out.println("average of float numbers is "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average obj=new Average();
		obj.average(10, 20, 30);
		obj.average(20.5f, 10.5f, 5.5f);

	}

}
