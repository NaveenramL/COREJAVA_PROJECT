package singleInheritance;

public class Child extends Parent
{
String bike;
float engineCC;

void getInfo(String b,float e)
{
	this.bike=b;
	this.engineCC=e;
}

void display()
{
	super.display();
	System.out.println(this.bike+" "+this.engineCC);
}

}
