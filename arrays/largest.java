import java.util.Scanner;

public class largest {
    static int largestElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("enter element : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int ans = largestElement(nums);
        System.out.print(ans);

    }
    
}
