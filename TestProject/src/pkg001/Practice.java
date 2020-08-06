package pkg001;

public class Practice {
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is:"+c);
	}
	public static void main(String[] args) {
		System.out.println("Test data:76+36");
		Practice p=new Practice();
		p.sum(76,36);
	}

}
