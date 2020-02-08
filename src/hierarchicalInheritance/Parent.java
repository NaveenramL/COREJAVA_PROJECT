package hierarchicalInheritance;

public class Parent
{

	String name;
	long phone;
	String color;
	
	void setInfo(String n,long p,String c)
	{
		this.name=n;
		this.phone=p;
		this.color=c;
	}
	void displayDetails()
	{
		System.out.println(this.name+" "+this.phone+" "+this.color);
	}
}
