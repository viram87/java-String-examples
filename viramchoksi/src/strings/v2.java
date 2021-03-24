package strings;

public class v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "     java program     ";
		
		System.out.println(str1.length());
		
		//to uppercase
		String str = str1.toUpperCase(); 
		
		//to remove all spaces
		String str2 = str1.trim();
		
		//to print some speific order of elements
		String str3 = str1.substring(9,13);
		
		//to replace one letter to another
		String str4 = str1.replace('a' , 'm');
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
