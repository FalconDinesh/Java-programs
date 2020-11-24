import java.util.*;

public class romanconv {
	public static int value(char r){
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}
	public static int romanToDecimal(String str){
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));
				if (s1 >= s2) {
					// Value of current symbol is greater or equalto the next symbol
					res = res + s1;
				}
				else{
					// Value of current symbol is less than the next symbol
					res = res + s2 - s1;
					i++;
				}
			}
			else {
				res = res + s1;
			}
		}
		return res;
	}
	public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        // Considering inputs given are valid
        System.out.println("Enter the roman numeral:");
		String str = in.nextLine();
        int n = romanToDecimal(str);
        System.out.println(n);
	}
}
