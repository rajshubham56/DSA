import java.util.Scanner;

public class q1 {
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void bubble_Sort1(int[] nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]<nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("enter all element : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        bubble_Sort1(nums);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
        }
    }
}
