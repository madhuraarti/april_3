package EXCETIONALHANDLING;

public class example4 
{

    public static void main(String[] args) 
    {
	 String s1 ="abcd";
	 
	try
	{
		System.out.println(s1.charAt(5)); // risky code
	}
	 
	 catch(ArrayIndexOutOfBoundsException e)
	 
	 {
		 System.out.println("Array Index Out Of Bounds Exception handled");
		 
	 }
	
	catch(ArithmeticException e)
	 
	 {
		 System.out.println("ArithmeticException handled");
		 
	 }
    
	catch(StringIndexOutOfBoundsException e)
	 
	 {
		 System.out.println("String Index Out Of Bounds Exception handled");
		 
	 }
    
	System.out.println("Hi");
	System.out.println("Hello");
    
    
    }


}
