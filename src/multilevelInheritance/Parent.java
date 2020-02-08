package multilevelInheritance;

public class Parent 
{

	String name;
	long phone;
	
	void getInfo(String n,long p)
	{
		this.name=n;
		this.phone=p;
	}
	
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.phone);
	}
}
