import java.util.*;
public class pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The difference:");
        int k = in.nextInt();int count=0;
        System.out.println("Size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = in.nextInt();
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        for(int i=n;i>0;i--){
            for(int j=i-1;j>0;j--){
                if(arr[i]-arr[j]==k){
                    count=count+1;
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}
