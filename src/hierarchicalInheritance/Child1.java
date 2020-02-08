package hierarchicalInheritance;

public class Child1 extends Parent
{

	String city;
	String sports;
	float points;
	
	void setThisInfo(String cy,String ss,float ps)
	{
		this.city=cy;
		this.sports=ss;
		this.points=ps;
	}
	
	void setWholeInfo(String n,long p,String c,String cy,String ss,float ps)
	{
		super.setInfo(n, p, c);
		this.city=cy;
		this.sports=ss;
		this.points=ps;
		
	}
	
	void details()
	{
		super.displayDetails();
		System.out.println(this.city+" "+this.sports+" "+this.points);
		
	}
}
