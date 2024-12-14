package binary;

import java.util.Scanner;

public class binaryq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("enter all element : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        Quick_Sort(nums,0,n-1);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
        }
    }
}
