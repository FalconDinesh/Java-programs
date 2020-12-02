/*import java.util.*;
class move_zeros{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int n1 = input.nextInt();
        int[] nums = new int[n1];
        System.out.println("Enter the 1st array:");
        for(int i=0;i<n1;i++){
            nums[i]=input.nextInt();
        }
        int temp;
        for(int i=0;i<n1;i++){
            if(nums[i]==0){
                temp=nums[i];
                nums[i]=nums[n1-1];
                nums[n1-1]=temp;
                n1--;
                i++;
            }
        }
        System.out.print("1st Array: ");
        for(int i: nums)
            System.out.print(i+" ");
        input.close();
    }
}*/

import java.util.*;
class move_zeros{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int n1 = input.nextInt();
        int[] nums = new int[n1];
        System.out.println("Enter the 1st array:");
        for(int i=0;i<n1;i++){
            nums[i]=input.nextInt();
        }
        int temp;
        for(int i=0;i<n1;i++){
            for( int j = 0;j<n1-i-1;j++){
                if(nums[j]==0) {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.print("Modified Array: ");
        for(int i: nums)
            System.out.print(i+" ");
        input.close();
    }
}