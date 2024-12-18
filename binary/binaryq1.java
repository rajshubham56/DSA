

import java.util.Scanner;

public class binaryq1 {
    static boolean binary_search(int[] nums,int st,int end,int target){
        if(st<=end){
            int mid = st+(end-st)/2;
        if(nums[mid]==target) return true;
        else if(nums[mid]>target){
            return binary_search(nums,st,mid-1,target);
        }else{
            return binary_search(nums,mid+1,end,target);
        }  
        } 
        return false;  
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
        System.out.print("enter target :");
        int target = sc.nextInt();
        boolean ans = binary_search(nums,0,n-1,target);
        System.out.print(ans);
    }
}
