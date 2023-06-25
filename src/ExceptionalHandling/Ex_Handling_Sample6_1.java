package ExceptionalHandling;

public class Ex_Handling_Sample6_1 

{

	public static void main(String[] args) 
	  
	   {
		          
		int num1=10;
		int num2=0;
		int div=0;     // this is a global variable so we have initialised global variable
		
	     // 	int div=num1/num2;      // 10/0 = infinity
		
	    	System.out.println(div);    // ArithmeticException  // div is not present
	   
		// Hence program will not excuted due to Arithmetic it is called Exception
	   
		// for finding the solution so we have to use exceptional handling
	  
	   try 
	   {
		    div=num1/num2; // this is local variable so we have initialised globel variable
	   }
		catch(ArithmeticException s6)
	   {
			
	   }
		
		
	   }





}
