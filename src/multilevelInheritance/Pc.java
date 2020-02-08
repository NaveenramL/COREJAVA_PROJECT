package multilevelInheritance;

public class Pc extends Parent
{

	String car;
	int cc;
	
	void setInfo(String c,int cc)
	{
		this.car=c;
		this.cc=cc;
	}
	
	void display()
	{
		System.out.println(this.car+" "+this.cc);
	}
}
