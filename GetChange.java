
import java.util.Scanner;
/**
 * This program is for you to try what you have learned from this chapter. 
 * 
 * @author (insert here)
 * @return (version here) 
 * 
 */
public class GetChange {
	  public static void main(String[] args) {   
		    // Create a Scanner
		    Scanner input = new Scanner(System.in);

		    // Receive the amount 
		    System.out.print("Enter the cost the customer has to pay: ");
		    double cost = 52.14;
            System.out.print("Enter the amount the customer pays: ");
            double amtPaid = 100.0; 
            
            // Calculate the amount of change that the customer should receive; 
            double change = amtPaid - cost;
            
            // Take two significant digits by shifting left 2 digits 
            // (preparing for rounding-off the change to the 100th digit.)
            // put the result to remainingAmount;  This one I give you.            
		    int remainingAmount = (int)(change * 100);

		    // Find the number of one dollars by shifting right two digits and take only whole number
		    int numberOfOneDollars = (int)(remainingAmount/100.0);
		    // update the remainingAmount to total cents the customer should receive
		    remainingAmount = remainingAmount - (numberOfOneDollars * 100);

		    // Find the number of quarters in the remaining amount
		    int numberOfQuarters = (int)(remainingAmount / 25);
		    // update the remainingAmount to the cents that have not received by the customer. 
		    remainingAmount = remainingAmount - (numberOfQuarters * 25);
		    
		    // Find the number of dimes in the remaining amount
		    int numberOfDimes = (int)(remainingAmount / 10);
		    // update the remainingAmount to the cents that have not received by the customer.
		    remainingAmount = remainingAmount - (numberOfDimes * 10);

		    // Find the number of nickels in the remaining amount
		    int numberOfNickels = (int)(remainingAmount / 5);
		    // update the remainingAmount to the cents that should be the pennies that customer should receive.
		    remainingAmount = remainingAmount - (numberOfNickels * 5);

		    // Find the number of pennies in the remaining amount.  This one I give you. 
		    int numberOfPennies = remainingAmount;

		    // Display results (Study this part by yourself)
		    System.out.println("Your amount " + change + " consists of"); 
		    System.out.println("    " + numberOfOneDollars + " dollars");
		    System.out.println("    " + numberOfQuarters + " quarters ");
		    System.out.println("    " + numberOfDimes + " dimes"); 
		    System.out.println("    " + numberOfNickels + " nickels");
		    System.out.println("    " + numberOfPennies + " pennies");
		  }
}
