/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Homework 2
*/
package Homework_2;
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		//declaring scanner and prompting users for input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the driving distance");
		double drivingDistance = s.nextDouble();
		System.out.println("Enter miles per gallon");
		double mpg = s.nextDouble();
		System.out.println("Enter price per gallon");
		double gasPrice = s.nextDouble();
		//computing gallons needed and total cost
		double gallonsNeeded = drivingDistance / mpg;
		double drivingCost = gasPrice*gallonsNeeded;
		
		System.out.println("The cost of this drive is $" + drivingCost);
	}
}
