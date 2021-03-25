
public class PassByRef {

	public static void main(String[] args) {
		// Arrays are reference types
		// Arrays are objects and they are stored on the heap
		int[] numbers = { 100, 200 };
		System.out.println("Before: " + numbers[0] + ", " + numbers[1]);
		doubleIt(numbers);
		System.out.println("After: " + numbers[0] + ", " + numbers[1]);

		// foreach loop can be used if you want to just read the items in the collection and not modify
		for (int num : numbers) {
			System.out.println(num);
		}
		
	}
	
	static void doubleIt(int[] arr) {
		arr[0] = arr[0] * 2;
		arr[1] = arr[1] * 2;
	}

}
