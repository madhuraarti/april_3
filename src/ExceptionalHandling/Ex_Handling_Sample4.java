package ExceptionalHandling;

public class Ex_Handling_Sample4 
{

	public static void main(String[] args) 
	  
	   {
		            //  0  1  2  3  
		   int[] ar = {40,20,10,30};
		 
		  // System.out.println(ar[4]);  // ArrayIndexOutOfBoundsException
		   
		   System.out.println("hi");
		   
		   System.out.println("hello");
	   
	      
		    // Hence program will not excuted due to array index is out bound it is called Exception
	   
		
		   // for finding the solution so we have to use exceptional handling
	  try 
	     {
		  System.out.println(ar[4]);  // risky code
	     }
	  
	 catch(ArrayIndexOutOfBoundsException s4)
	  
	    {
	   
	  
	     }

	    System.out.println("--------------");
	   
	    System.out.println("hi madhur ");
	   
	    System.out.println("hello madhur");
	   
	   }
}
