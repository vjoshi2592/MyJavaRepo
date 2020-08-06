package pkg001;

public class Construct 
{
	public Construct()
	{
		this(10,25,43,46);
		System.out.println("Default Constructor");
	}
	public Construct(int a)
	{
		this();
		System.out.println("1 parameterized Constructor");
	}
	public Construct(int a, int b)
	{
		this(10);
	    System.out.println("2 parametrized Constructor");	
	}
	public Construct(int a, int b, int c)
	{
		this(10,20);
	    System.out.println("3 parametrized Constructor");
	}
	public Construct(int a, int b, int c, int d)
	{
	    System.out.println("4 parametrized Constructor");	
	}
	public static void main(String[] args)
	{
		Construct c=new Construct(10,25,15);
		
	}
}
