package strings;

public class v5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "VIRAM";
		String str1 = "viram";
		String str2 = "viram";
		
		//check the equality of the characters or strings
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str2)); //ignore case sensitive
		
		//combine two strings
		
		System.out.println(str.concat(str2)); //method 1
		System.out.println(str + str2); //method 2
		
		
		
		
	}

}
