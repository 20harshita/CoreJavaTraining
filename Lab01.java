import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		int target = (int)(Math.random() * 100);
		int guess = -1;
		Scanner scanner = new Scanner(System.in);
		boolean gameOver = false;
		int attempts = 0;
		System.out.println("Welcome to the guessing game. Enter a number between 1 and 100");
		
		while(!gameOver) {
			guess = scanner.nextInt();
			attempts++;
			if(guess > target) {
				System.out.println("Aim Lower");
			}
			else if(guess < target) {
				System.out.println("Aim Higher");
			}
			else {
				System.out.println("You 've got it in " + attempts + " attempts");
				gameOver = true;
			}
		}
		scanner.close();
	}

}
