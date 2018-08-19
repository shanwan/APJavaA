import java.util.Scanner;
/**
 * 
 * @author (Eric Y. Chou)
 * @version (V1.0, 11/05/2015)
 */
public class CelsiusToFahrenheit {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter a degree in Celsius: ");
		    double celsius = input.nextDouble(); 

		    // Convert Fahrenheit to Celsius
		    double fahrenheit = celsius * 9.0/5.0 + 32.0;
		    System.out.println("Celsius " + celsius + " is " + 
		      fahrenheit + " in Fahrenheit");  
		  }
}
