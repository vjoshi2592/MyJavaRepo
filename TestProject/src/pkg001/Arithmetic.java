package pkg001;

public class Arithmetic {
       public int sum(int a,int b)
       {
    	   int c=a+b;
    	   System.out.println("The result of sum is:" +c);
    	   return c;
       }
       public int sub(int a,int b)
       {
    	   int c=a-b;
    	   System.out.println("The result of subtraction is:" +c);
    	   return c;
       }
       public int mul(int a,int b)
       {
    	   int c=a*b;
    	   System.out.println("The result of multiplication is:" +c);
    	   return c;
       }
       public void div(int a,int b)
       {
    	   int c=a/b;
    	   System.out.println("The final result is:" +c);		  
       }
       public static void main(String[] args) {
    	   System.out.println("Assignment 1:((((10+2)+2)-2)*2/2)");
    	   Arithmetic o=new Arithmetic();
    	   int sumresult=o.sum(10,2);
    	   int sumresult1=o.sum(sumresult,2);
    	   int subresult=o.sub(sumresult1,2);
    	   int mulresult=o.mul(subresult,2);
    	   o.div(mulresult,2);
       }	   
 
}













