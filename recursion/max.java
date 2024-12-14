import java.util.Scanner;

public class max {
    static int max_(int[] nums,int idx){
        if(idx == nums.length-1) return nums[idx];
        int mx = max_(nums,idx+1);
        if(nums[idx]<mx){
            return mx;
        }else{
            return nums[idx];
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
        int ans = max_(nums,0);
        System.out.print(ans);
     }
}

