package pkg.sample;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b=new StringBuffer("good");
		System.out.println(b.append("morning"));
		System.out.println(b.insert(1,"ll"));
		System.out.println(b.delete(1, 3));			
		System.out.println(b.replace(4, 13, "night"));
	}

}
