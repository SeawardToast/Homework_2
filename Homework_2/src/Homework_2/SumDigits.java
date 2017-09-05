/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Homework 2
*/
package Homework_2;
import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		//declaring scanner
		Scanner s = new Scanner(System.in);
		//prompting user for input
		System.out.println("Enter an integer between 0 and 1000");
		int userInput = s.nextInt();
			//check to see if value is in range
			if (userInput > 0 && userInput < 1000) {
			int num1 = userInput % 10;
			int nextInt = userInput / 10;
			int num2 = nextInt % 10;
	    	int num3 = nextInt / 10;
			int sumOfInts = num1 + num2 + num3;
			System.out.println("The sum of the digits is " + sumOfInts);
			} else {
				System.out.println("Sorry you entered values out of range.. Try again!");
			}
	}
}
