package pkg001;

public class Construct1 
{
	public void m1()
	{
		this.m4();
		System.out.println("Default Constructor");
	}
	public void m2()
	{
	    this.m1();
		System.out.println("1 parameterized Constructor");
	}
	public void m3()
	{
		this.m2();
	    System.out.println("2 parametrized Constructor");	
	}
	public void m4()
	{
	    System.out.println("3 parametrized Constructor");
	}
	public void m5()
	{
		this.m3();
	    System.out.println("4 parametrized Constructor");	
	}
	public static void main(String[] args)
	{
		Construct1 c1=new Construct1();
		c1.m5();
		
	}
}

