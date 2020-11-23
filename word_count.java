import java.util.*;

class word_count{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        int n=words.length;
        System.out.println(n);
    }
}