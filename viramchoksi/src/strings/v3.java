package strings;

public class v3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mr. viram choksi";
		
		
		/*to find the string is starting or ending with 
		  any specific word or character or not */
		
		System.out.println(str.startsWith("Mr."));
		System.out.println(str.startsWith("vir" , 4));
		
		System.out.println(str.endsWith("ksi"));	
		
		System.out.println(""); //line break
		
		//check the character on specific index
		
		System.out.println(str.charAt(5));
		System.out.println(" "); // line break
		
		//to print whole string 
		
		for(int i=0 ; i < str.length() ; i++)
		{
			System.out.println(str.charAt(i)); //line by line
		}
		
		System.out.println(" "); // line break
		
		for(int i=0 ; i < str.length() ; i++)
		{
			System.out.print(str.charAt(i)); //single line
		}
		
		
		
		
		
		
		
		
		
		
		
				
				
		

	}

}
