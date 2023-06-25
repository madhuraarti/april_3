package ExceptionalHandling;

public class Ex_Handling_Sample2 
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
	   
		   System.out.println(s1.charAt(6));  // risky code  // event is being triggering
	   }
	    //                         |
	   //                          |-------> Must be matched  // which type of exception happened
	   //                          | 
	   catch(StringIndexOutOfBoundsException e)  // e is any name of object like a or b etc it is used to store the information
	   {
		   
		   // it optional for print
	   }
	   
        System.out.println("--------------");
	   
	   System.out.println("hi madhur ");
	   
	   System.out.println("hello madhur");


	   
	   }
	}
