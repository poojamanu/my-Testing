package pkg.sample;

public class AccessSpecifier {
public void display()
{
	System.out.println("it is a public method");
}
private void display(String a)
{
	System.out.println("it is private method");
}
protected void display(int a)
{
	System.out.println("it is protected method");
}
void display(float n)
{
	System.out.println("it is default method");
}
}
