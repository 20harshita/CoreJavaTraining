
public class ArraysExample {

	public static void main(String[] args) {
		
		//Arrays are reference types. Stored on the heap
		int[] numbers = {1, 2, 3, 4, 5};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] numbersArr = {1, 2, 3, 4, 5};
		int numbersArray[] = {1, 2, 3, 4, 5};
		
		int[] lst = new int[10];
		int list[] = new int[10];
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		// 2D arrays are practically not used in realtime these days. Maps are used instead
		int[][] twoDim = new int[2][2];
		int[] twoD[] = new int[2][2];
		int twoDimen[][] = new int[2][2];
		
	}

}
