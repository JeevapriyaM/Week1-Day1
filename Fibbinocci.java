package week1.day1;

public class Fibbinocci { // Created a class by name: Fibbinocci

	public static void main(String[] args) { // Created a main method using shortcut- typing main and ctrl+space

		// Initialized 3 int variables
		int firstnumber = 0;
		int secondnumber = 1;
		int sum;
		
		// Printing first number
        System.out.print("Fibonacci Series of 11 numbers:");
		System.out.print(firstnumber + " ");
		System.out.print(secondnumber + " ");

		// Iterate from 1 to the 11
		for (int i = 1; i <= 11; i++) {

			sum = firstnumber + secondnumber; // Add first and second number assign to sum
			firstnumber = secondnumber; // Assign second number to the first number
			secondnumber = sum; // Assign sum to the second number
			System.out.print(sum + " "); // Print sum
		}

	}
}


