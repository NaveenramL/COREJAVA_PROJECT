package multilevelInheritance;

public class Pc1 extends Pc
{

	float rate;
	String fuel;
	
	void setDetails(float r,String f)
	{
		this.rate=r;
		this.fuel=f;
		
	}
	
	void details(String n,long p,int cc,String c,float r,String f)
	{
		this.car=c;
		this.cc=cc;
		this.name=n;
		this.fuel=f;
		this.phone=p;
		this.rate=r;
	}
	
	void display()
	{
		System.out.println(this.name+" "+this.phone+" "+this.car+" "+this.cc+" "+this.fuel+" "+this.rate);
	}
}
