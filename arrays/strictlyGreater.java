import java.util.*;
public class strictlyGreater {
    static int countNumber(int[] nums,int x){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<x){
                count++;
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
        int ans = countNumber(nums,x);
        System.out.print(ans);
    }
    
}
