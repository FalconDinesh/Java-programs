import java.util.*;

class word_reverse{

    public static void wordReverse(String str){
        Stack<String> st = new Stack<String>();
        String[] words = str.split(" ");

        for(String temp: words){
            st.add(temp);
        }
        while (!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("String to reverse the words:");
        String str = in.nextLine();
        wordReverse(str);
    } 
}
