package EXCETIONALHANDLING;

public class example5_1 
{

    public static void main(String[] args) 
    {
	 String s1 ="abcd";
	 
	try
	{
		System.out.println(s1.charAt(2)); // risky code
	}
	 
	 catch(Exception e)
	 
	 {
		 System.out.println("generic Exception handled");
		 
	 }
	
	    
	System.out.println("Hi");
	System.out.println("Hello");
    
    
    }


}
