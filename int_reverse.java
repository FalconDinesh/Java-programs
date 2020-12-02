import java.util.*;

class int_reverse{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int remainder=0;
                int reverse=0;
                int x = in.nextInt();
                while(x!=0){
                    remainder=x%10;
                    reverse=reverse*10+remainder;
                    x/=10;
                }
                System.out.println(reverse);
                in.close();
    }
}
/*class Solution {
    public int reverse(int x) {
        String str = Integer.toString(Math.abs(x));
        char[] chaar = str.toCharArray();
        int [] output = new int[chaar.length];
        for(int i = chaar.length-1;i>=0;i--){
            output[i]=Character.getNumericValue(chaar[i]);
        }
        int i, k = 0;
        for (i = output.length-1;i>=0; i--)
            k = 10 * k + output[i];
        if(x<0)
        {
            return -k;
        }
        else
            return k ;
    }
}

class Solution {
    public int reverse(int x) {
        if(x==-2147483412){
           return -2143847412;
        }
        else if((x>=1500000000) || (x<=-1563847412)){
            return 0;
        }
        else{
            int remainder=0;
            int reverse=0;
            while(x!=0){
                remainder=x%10;
                reverse=reverse*10+remainder;
                x/=10;
            }
            if(x<0)
            {
                return -reverse;
            }
            else
                return reverse ;
            }
        }
}

*/
        