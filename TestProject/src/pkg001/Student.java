package pkg001;
 
public class Student{
	
	int Rollno;
	int Age;
	
	public void method1()
	{
		System.out.println("Welcome All");
	}
    
	public void method2()
	{
		System.out.println("Automation is easy");
	}

    public static void main(String[] args)
    {
    	Student Deepak=new Student();
    	Deepak.Rollno=20;
    	Deepak.Age=25;
    	
    	System.out.println("The Roll no. of student is "+Deepak.Rollno);
    	System.out.println("The age of student is "+Deepak.Age);
    	Deepak.method1();
    	Deepak.method2();
    }
}

