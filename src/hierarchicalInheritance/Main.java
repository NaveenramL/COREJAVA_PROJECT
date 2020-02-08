package hierarchicalInheritance;

public class Main 
{

	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.setInfo("Ram", 9978666l, "green");
		p.displayDetails();
		
		Child2 cd=new Child2();
		cd.fullDetailsInfo("la", 999999l, "white", "Sairam", 999.865d);
        cd.display();
        
        Child1 c1=new Child1();
        c1.setThisInfo("vpm", "kabadi", 89.2324f);
        c1.details();
	}

}
