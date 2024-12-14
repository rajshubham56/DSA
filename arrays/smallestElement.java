import java.util.Scanner;

public class smallestElement {
    static int smallest_Element(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
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
        int ans = smallest_Element(nums);
        System.out.print(ans);

    }
}
