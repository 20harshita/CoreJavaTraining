public class DataTypes {
	public static void main(String[] args) {
		// primitive and reference
		
		//i, b, pi, num, letter, numFloat are variables
		int i = 10;
		boolean b = false;
		double pi = 3.14;
		long num = 23213213;
		float numFloat = 2.34f;
		char letter = 'A';
		
		// int, boolean, double, long, float, char are primitive data types
		// primitive types are those that are stored in the stack
		
		//Local variables
		// All local variables have to be initialized before using
		int j = 0;
		System.out.println(j);
		
		
		int number = 100;
		increment(number); // All primitive types are passed by value only
		System.out.println("After incrementing " + number);
		
	}
	
	static void increment(int num) {
		num++;
	}
}
