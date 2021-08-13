package pkg.sample;

public class EmployeeMain extends Employee2 {
	
	double total_salary;
	public double total_salary()
	{
		super.cal_hra_pf();
		total_salary=basic+hra+bonus-pf-deduct;
		return total_salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeMain obj=new EmployeeMain();
		obj.total_salary(); 
		System.out.println("SALARY SLIP");
		System.out.println("BASIC PAY : "+obj.basic);
		System.out.println("HRA : "+obj.hra);
		System.out.println("PF : "+obj.pf);
		System.out.println("Deduction : "+obj.deduct);
		System.out.println("BONUS :"+obj.bonus);
		System.out.println("TOTAL SALARY :"+obj.total_salary);

	}

}
