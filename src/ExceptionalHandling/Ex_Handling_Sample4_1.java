package ExceptionalHandling;

public class Ex_Handling_Sample4_1 
{

	public static void main(String[] args) 
	  
	   {
		            //  0  1  2  3  
		   int[] ar = {40,20,10,30};
		 
		  // System.out.println(ar[4]);  // ArrayIndexOutOfBoundsException
		   
		   System.out.println("hi");
		   
		   System.out.println("hello");
	   
		   System.out.println("--------------");
		   
		   // Hence program will not excuted due to array index is out bound it is called Exception
	   
	  try 
	     {
		  System.out.println(ar[4]);  // risky code
	     }
	  
	 catch(ArrayIndexOutOfBoundsException s4)
	  
	    {
	   
		 System.out.println(ar[0]);  // alternate solutions
		 
		 System.out.println("Array Index Out Of Bounds Exception Handling");
	  
	     }

	    System.out.println("--------------");
	   
	    System.out.println("hi madhur ");
	   
	    System.out.println("hello madhur");
	   
	   }
}
