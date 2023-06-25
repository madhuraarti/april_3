package ExceptionalHandling;

public class Ex_Handling_Sample2_1 
{

	public static void main(String[] args) 
	  
	   {
		 
		   String s1="abcd";
		 
		  // System.out.println(s1.charAt(6)); // risky code // StringIndexOutOfBoundsException // 6 is invalied input
		   
		   System.out.println("hi");
		   
		   System.out.println("hello");
	   
	      // Hence program will not excuted due to string index is out bound it is called Exception
	   
	      // for finding the solution so we have to use exceptional handling
	   
	   try
	   
	   {
	   
		   System.out.println(s1.charAt(6));  // risky code
	   }
	   
	   catch(StringIndexOutOfBoundsException e)
	   {
		   
		   System.out.println("String Index Out Of Bounds Exception Handling");
	   
	   }
	   
	   System.out.println("--------------");
	   
	   System.out.println("hi madhur ");
	   
	   System.out.println("hello madhur");

	   
	   }
	}
