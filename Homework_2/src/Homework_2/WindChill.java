/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Homework 2
*/
package Homework_2;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		//declarations
		Scanner s = new Scanner(System.in);
		double outsideTemp;
		double windSpeed;
		//prompting users for input
		System.out.println("Enter a temperature in fareinheight between -58 and 41 and a wind speed of 2 or above");
		outsideTemp = s.nextDouble();
		windSpeed = s.nextDouble();
		//checking if values are in range
			if (outsideTemp > -58 && outsideTemp < 41 && windSpeed >= 2) {
		
				double windChill = 35.74 + 0.6215*outsideTemp - 35.75*(Math.pow(windSpeed, .16)) + 0.4275*(outsideTemp*Math.pow(windSpeed, .16));
				System.out.println("The wind chill index is " + windChill);
			}
		
			else {
				System.out.println("You enterd values out of range. Try again!");
			}
	}
}
