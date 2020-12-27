import java.util.*;
public class binary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int i;String op="";
        int first;int second;
        first=Integer.parseInt(String.valueOf(str.charAt(0)));
        sc.close();
        for(i=1;i<str.length();i++)
        {  
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch=='A')
                    op="and";
                else if(ch=='B')
                    op="or";
                else if(ch=='C')
                    op="xor";
            }
            else if(Character.isDigit(ch))
            {
                second=Integer.parseInt(String.valueOf(ch));
                if(op.equals("and"))
                    first=first & second;
                else if(op.equals("or"))
                    first=first | second;
                else if(op.equals("xor"))
                    first=first ^ second;
            }
    }
    System.out.println(first);
    }
}
