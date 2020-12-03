class valid_palindrome {
    public static void main(String[] args) 
	{ 
		String s = "race a car"; 
		s = s.replaceAll("\\s", ""); 
        s = s.replaceAll(",","");
        s = s.replaceAll(":","");
        s = s.replaceAll("\"", "");
        s = s.replaceAll(".", "");
        String palindrome = "";
        for(int i=s.length()-1;i>=0;i--){
            palindrome+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(palindrome))
            System.out.println("Palindrome");
        else{
            System.out.println("Not a palindrome");
        }
		System.out.println(s); 
	} 
}
