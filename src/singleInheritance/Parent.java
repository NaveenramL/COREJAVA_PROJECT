package singleInheritance;

public class Parent 
{

	int age;
	String name;
	
	void getInfo(int a,String n)
	{
		this.age=a;
		this.name=n;
	}
	
	void display()
	{
		System.out.println(this.name+" "+this.age);
	}
}
