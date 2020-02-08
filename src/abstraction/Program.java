package abstraction;

public abstract class Program 
{

	String name;
	int age;
	float marks;
	int companies;
	long id;
	
	 abstract void setDetails(String n,int a);
	 
	 void setInfo(float m,int c)
	 {
		 this.marks=m;
		 this.companies=c;
	 }
	 
	 void displayDetails()
	 {
		 System.out.println(this.marks+" "+this.companies);
	 }
}
