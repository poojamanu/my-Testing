package pkg.sample;

public class StaticBlock {
	static String name="ammu";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		name="veena";
		System.out.println(name);
	}
	static {
		name="meena";
		System.out.println(name);
		
	}

}
