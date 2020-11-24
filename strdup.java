import java.util.*;

class strdup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        String str=sc.nextLine();
        int len=str.length();
        int j;
        char ch[]=str.toCharArray();
        System.out.println("Length of String "+str+" is "+len);
        for(int i=0;i<str.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                if(ch[i]==ch[j])
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.print(ch[j]);
            }
        }
    }
}
