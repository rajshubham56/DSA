import java.util.*;
public class sortedArrayOrNot {
    // static boolean sortedOrNot(int[] nums){
    //     boolean flag = true;
    //     for(int i=1;i<nums.length;i++){
    //        if(nums[i]<nums[i-1]){
    //         flag = false;
    //        }
    //     }
    //     return flag;
    // }
    static void sortedOrNot(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        // System.out.print("enter x = ");
        // int x = sc.nextInt();
        System.out.print("enter element :");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        sortedOrNot(nums);
        
    }
}
