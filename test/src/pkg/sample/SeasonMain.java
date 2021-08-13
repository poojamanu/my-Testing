package pkg.sample;
import java.util.*;
public class SeasonMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter total amount : "); 
		int amt=s.nextInt();
		System.out.println("off season price");
		OffSeason s1=new OffSeason(amt);
		s1.discount();
		
		System.out.println("On season price");
		OnSeason s2=new OnSeason(amt);
		s2.discount();

	}

}
