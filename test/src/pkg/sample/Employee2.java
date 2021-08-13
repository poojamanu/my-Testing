package pkg.sample;

public class Employee2 extends Employee1 {
	float hra,pf;
	public void cal_hra_pf()
	{
		super.get_salary();
		hra=(basic*5)/100;
		pf=(basic*20)/100;
	}

}
