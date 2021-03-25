
import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		populateNumbers(numbers);
		squareNumbers(numbers);
		incrementNumbers(numbers);
		doubleNumbers(numbers);
		printStatus("Output", numbers);
	}
	
	private static void squareNumbers(int[] numbers) {
		printStatus("squaring", numbers);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * numbers[i];
		}
	}
	
	private static void printStatus(String operation, int[] numbers) {
		String output = "***" + operation + "(";
		for (int i : numbers) {
			output += i + ", ";
		}
		output = output.substring(0, output.length() - 2);
		output += ")";
		System.out.println(output);
		
	}

	private static void doubleNumbers(int[] numbers) {
		printStatus("doubling", numbers);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 2;
		}
	}
	
	private static void incrementNumbers(int[] numbers) {
		printStatus("incrementing", numbers);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] + 1;
		}
	}

	private static void populateNumbers(int[] numbers) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter number " + (i+1));
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
