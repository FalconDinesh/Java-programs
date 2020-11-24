import java.util.*;

class dupword{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String str = input.nextLine();
        str = str.toLowerCase();
        System.out.println("The lowercased string is: "+str);
        String words[] = str.split(" ");
        int i,j,count=0;
        for(i=0;i<words.length;i++){
            count=1;
            for(j=i+1;j<words.length;j++){
                if(words[j].equals(words[i])){
                    count++;
                    words[j]="0";
                }
            }
            if(count> 1 && words[i]!="0"){
                System.out.println("Duplicate words: "+words[i]);
            }
        }

    }
}