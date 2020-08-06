package pkg001;

public class Arithmetic1 {
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;		
	}
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int mul(int a,int b)
    {
 	   int c=a*b;
 	   return c;
    }
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("The final result is:"+c);
	}
	public static void main(String[] args)
	{
		Arithmetic1 obj=new Arithmetic1();
		System.out.println("Assignment 2:((((10-2)+2)-2)*2)/2)");
		int a=10, b=2;
		int subres=obj.sub(a,b);
		System.out.println("The result of 1st subtraction is:"+subres);
		int sumres=obj.sum(subres,b);
		System.out.println("The result of 1st sum is:"+sumres);
		int subres1=obj.sub(sumres,b);
		System.out.println("The result of second subtraction is:"+subres1);
		int mulres=obj.mul (subres1,b);
		System.out.println("The result of multiplication is:"+mulres);
		obj.div(mulres,b);
		
		
		
	}
}
