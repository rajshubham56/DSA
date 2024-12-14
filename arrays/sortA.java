import java.util.Scanner;

public class sortA {
    static void reverse(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;  
    }
    static int[] sort_array(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]%2!=0 && nums[right]%2==0){
                reverse(nums,left,right);
            }
            left++;
            right--;
            if(nums[left]%2==0) left++;
            if(nums[right]%2!=0) right--;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter value of element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans =sort_array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        } 
    }
}
