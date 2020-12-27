import java.util.*;

class duplicate_zero {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the array size : ");
    int n = in.nextInt();
    System.out.println("Enter the array elements : ");
    int[] arr = new int[n];
    for(int i = 0;i < n ; i++){
        arr[i] = in.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            for (int j = arr.length - 1; j > i; j--) {
                arr[j] = arr[j-1];
            }
            i++;
        }
    }
    in.close();
        for( int i : arr){
            System.out.print(i+" ");
        }
    }
}
