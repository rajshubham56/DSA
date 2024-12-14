import java.util.Scanner;

public class printArray {
   static void print_Array(int[] nums,int idx){
        if(idx==nums.length) return;
        System.out.print(nums[idx]);
        print_Array(nums,idx+1);
        
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
        print_Array(nums,0);
    //     for(int i=0;i<nums.length;i++){
    //         System.out.print(nums[i]+" ");
    //     }
     }
}
