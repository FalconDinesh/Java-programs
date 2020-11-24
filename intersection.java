import java.util.*;
import java.io.*;
import java.lang.*;

class intersection{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of 1st array and 2nd array");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        System.out.println("Enter the 1st array:");
        for(int i=0;i<n1;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the 2nd array:");
        for(int i=0;i<n2;i++){
            b[i] = in.nextInt();
        }
        System.out.print("1st Array: ");
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.print("\n2nd Array: ");
        for(int i: b){
            System.out.print(i+" ");
        }
        String out = "";
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    out = out + Integer.toString(a[i]);
                }
            }
        }
        System.out.println("\n"+out);
        char [] ch;
        ch=out.toCharArray();
        System.out.print(ch);
    }
}