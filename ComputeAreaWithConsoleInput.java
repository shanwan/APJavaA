import java.util.Scanner; 
/**
 * Write a description of class ComputeAreaWithConsoleInput here.
 * 
 * @author (insert here)
 * @version (version here)
 */
public class ComputeAreaWithConsoleInputAndConstant
{
   	  public static void main(String[] args) {
   	        final double PI = 3.141592; 
		    double radius; // Declare radius
		    double area; // Declare area
	        double perimeter; 
            Scanner input = new Scanner(System.in); 
            
		    // Assign a radius
		    System.out.print("Enter the radius: "); 
		    radius = input.nextDouble(); // New value is radius
          
		    // Compute area
		    area = radius * radius * PI;  
		    perimeter = PI * 2 * radius; 
		    // Display results
		    System.out.println("The area for the circle of radius " +
		      radius + " is " + area);  
		    System.out.println("The perimeter for the circle of radius " +
		      radius + " is " + perimeter); 
	  }
}
