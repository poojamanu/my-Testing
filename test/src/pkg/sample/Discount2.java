package pkg.sample;

public class Discount2 {
	//int item_number,item[];
	int total=0;
	int item[]=new int[5];
	Discount2(int a[])
	{
		item=a;
		for(int i=0;i<a.length;i++)
			total+=a[i];
	}
	
	public void cal_discount()
	{
		//total(item);
		if (total>=5000)
		{
			total-=(total*20)/100;
			System.out.println("total price after discount "+total);
			//return total;
		}
		else
			System.out.println("no discount!total price "+total);
		//return total;
	}

	

}
