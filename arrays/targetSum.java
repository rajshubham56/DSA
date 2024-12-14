import java.util.Scanner;
public class targetSum {
    static int isSum(int[] nums,int target){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];
    System.out.print("enter x = ");
    int x = sc.nextInt();
    System.out.print("enter element :");
    for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
    }
    int ans = isSum(nums,x);
    System.out.print(ans);
    }
}
