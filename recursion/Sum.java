import java.util.Scanner;

public class Sum {
    static int sumOfArray(int[] nums,int idx){
        if(idx==nums.length-1) return nums[idx];
        int ans = nums[idx] + sumOfArray(nums,idx+1);
        return ans;
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
        int ans = sumOfArray(nums,0);
        System.out.print(ans);
    }
}
