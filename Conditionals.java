public class Conditionals {

	public static void main(String[] args) {
		int i = 10;
		if(i % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		int counter = 0;
		while(counter < 5) {
			System.out.println(counter);
			counter++;
		}
		
		for (int j = 0; j < 5; j++) {
			System.out.println(j);
		}
		
		do {
			System.out.println("Wassup!");
			counter++;
		} while (counter < 10);
	}

}
