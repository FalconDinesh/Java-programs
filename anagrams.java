import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class anagrams{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the strings:");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        if(areAnagrams(a,b)){
            System.out.println("The string "+str1+" and string "+str2+" are anagrams of each other!!!");
        }
        else{
            System.out.println("The string "+str1+" and string "+str2+" are NOT anagrams of each other!!!");
        }
    }
    public static boolean areAnagrams(char[] a,char[] b){
        int n1=a.length;
        int n2=b.length;
        if(n1!=n2)
            return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n1;i++)
            if(a[i]!=b[i])
                return false;
        return true;
    }
}
     //or
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class anagrams{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the strings:");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if(areAnagrams(str1,str2)){
            System.out.println("The string "+str1+" and string "+str2+" are anagrams of each other!!!");
        }
        else{
            System.out.println("The string "+str1+" and string "+str2+" are NOT anagrams of each other!!!");
        }
    }
    public static boolean areAnagrams(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int count=0;
        for(int i=0;i<str1.length();i++)
            count=count+str1.charAt(i);
        for(int i=0;i<str2.length();i++)
            count=count-str2.charAt(i);
        return(count==0);
    }
}