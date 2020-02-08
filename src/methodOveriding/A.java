package methodOveriding;

public class A 
{

	String name;
	int marks;
	float average;
	
	void setInfo(String n,int m,float av)
	{
		this.name=n;
		this.average=av;
		this.marks=m;
	}
	
	void displayDetails()
	{
		System.out.println(this.name+" "+this.marks+" "+this.average);
	}
}
