
public class StringsExample {

	public static void main(String[] args) {
		// String is a reference type 
		// Stored on the heap
		// Literals are stored in the string pool
		String name = new String("Sam");
		String city = "Pune"; // An implicit object is created
		
	
		String weather1 = new String("Cold");
		String weather2 = "Cold";
		String weather3 = "Cold";
		
		System.out.println(weather1 == weather2); // false  (because weather1 and weather2 are references to different objects)	
		System.out.println(weather2 == weather3); // true
		
		// DO NOT USE == to compare strings. Use .equals() method instead
		System.out.println(weather1.equals(weather2));
		System.out.println(weather2.equals(weather3));
		
		
		// Strings are immutable
		
		String state = "TN";
		state += " is hot";
		state = "KA";
		state += " is cold";
		
		//Use StringBuffer instead
		String output = "";
		for(int i = 0; i< 100; i++) {
			output += i + ", ";	// 100 objects are created in the heap
		}
		System.out.println(output);
		
	}

}
