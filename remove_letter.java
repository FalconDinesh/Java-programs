import java.util.*;

class remove_letter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char letter = in.next().charAt(0);
        char[] ch = str.toCharArray();
        removeLetter(ch,letter);
    }
    public static void removeLetter(char[] ch,char letter){
        String newstring ="";
        int n1=ch.length;
        for(int i=0;i<n1;i++){
            if(ch[i]!=letter)
                newstring=newstring+ch[i];
        }
        System.out.println(newstring);
    }
}