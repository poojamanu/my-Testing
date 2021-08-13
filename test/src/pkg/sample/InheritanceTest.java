package pkg.sample;

public class InheritanceTest {
	
	public void display()
	{
		System.out.println("we can inherit public method");
	}
	private void show()
	{
		System.out.println("cant inherit private method");
	}
	protected void display1()
	{
		System.out.println("we can inherit protected in child class");
	}
	void print()
	{
		System.out.println("cant inherit in other package but in same pkg");
	}

}
