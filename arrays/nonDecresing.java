import java.util.*;

public class nonDecresing {
    static int[] squarSort(int[] nums){
        int n=nums.length;
        int[] arr1 = new int[n];
        int k=n-1;
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                arr1[k] = nums[left] * nums[left];
                k--;
                left++;
            }
            else{
                arr1[k] = nums[right] * nums[right];
                k--;
                right--;
            }
        }
        return arr1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n= sc.nextInt();
        int[] nums = new int[n];
        
        System.out.print("enter element : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans[] = squarSort(nums);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
