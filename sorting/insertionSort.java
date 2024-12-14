import java.util.Scanner;

public class insertionSort {
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void insertion_Sort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && nums[j]<nums[j-1]){
                swap(nums,j,j-1);
                j--;
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
        insertion_Sort(nums);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
        }
    }
}
