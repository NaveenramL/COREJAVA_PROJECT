package methodOveriding;

public class B extends A{

	char section;
	long phone;
	
	void setFullDetails(String n,int m,float av,char sc,long ph)
	{
		super.setInfo(n, m, av);
		this.section=sc;
		this.phone=ph;
	}
	
	void setInfo(String n,int m,float av)
	{
		super.setInfo(n, m, av);
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println(this.section+" "+this.phone);
	}
}
