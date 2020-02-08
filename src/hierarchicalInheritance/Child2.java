package hierarchicalInheritance;

public class Child2 extends Parent
{

	String college;
	double marks;
	
	void setDetails(String cl,double ms)
	{
		this.college=cl;
		this.marks=ms;
	}
	
	void fullDetailsInfo(String n,long p,String c,String cl,double ms)
	{
		super.setInfo(n, p, c);
		this.college=cl;
		this.marks=ms;
	}
	
	void display()
	{
		super.displayDetails();
		System.out.println(this.college+" "+this.marks);
		 
	}
}
