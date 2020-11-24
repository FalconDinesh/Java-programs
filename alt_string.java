import java.util.*;
class alt_string{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        int l1,l2,i,j;
        l1=str1.length();
        l2=str2.length();
        System.out.println("Length 1: "+l1+"\nLenght 2: "+l2);
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        for(i=0;i<str1.length();i++)
        {
            for(j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j)){
                    i++;
                }
            }
            System.out.print(ch1[i]);
        }
    }
}