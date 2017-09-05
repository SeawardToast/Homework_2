/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Homework 2
*/
package Homework_2;
import java.util.Scanner;

public class Gratuity {

	public static void main(String[] args) {
		//declarations
		Scanner s = new Scanner(System.in);
		double subtotal;
		double gratuity;
		//prompting user for input
		System.out.println("Enter the subtotal and gratuity rate");
		subtotal = s.nextDouble();
		gratuity = s.nextDouble();
		//computing and displaying total and gratuity
		double payedGratuity = (gratuity/100) * subtotal;
		double total = payedGratuity + subtotal;
		System.out.println("The total is $" + total + " and the gratuity is $" + payedGratuity);

	}
}
