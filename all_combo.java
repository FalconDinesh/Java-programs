public class all_combo { 

	static void printPermutn(String str, String ans) 
	{
		if (str.length() == 0) { 
			System.out.print(ans + " "); 
			return; 
		} 
		for (int i = 0; i < str.length(); i++) { 

			char ch = str.charAt(i); 
			// Rest of the string after excluding the ith character 
			String ros = str.substring(0, i) + str.substring(i + 1); 
            printPermutn(ros, ans+ch ); 
            
		} 
	} 
	public static void main(String[] args) 
	{ 
		String s = "abc"; 
		printPermutn(s, ""); 
	} 
}

