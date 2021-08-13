package pkg.sample;

public class OnSeason extends OffSeason {
	OnSeason(int amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}

	public void discount()
	{
		total_amt-= (40*total_amt)/100;
		System.out.println(total_amt);
	}

}
