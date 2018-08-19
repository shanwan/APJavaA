import java.util.Scanner;
/**
 * 
 * @author (Eric Y. Chou)
 * @version (V1.0, 11/05/2015)
 */
public class FahrenheitToCelsius {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter a degree in Fahrenheit: ");
		    double fahrenheit = input.nextDouble(); 

		    // Convert Fahrenheit to Celsius
		    double celsius = (5.0 / 9) * (fahrenheit - 32);
		    System.out.println("Fahrenheit " + fahrenheit + " is " + 
		      celsius + " in Celsius");  
		  }
}
