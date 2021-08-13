package pkg.sample;

public class OffSeason {
	float total_amt;
	OffSeason(int amt)
	{
	total_amt=amt;
	}
	public void discount()
	{
		total_amt-= (15*total_amt)/100;
		System.out.println(total_amt);
	}

}
