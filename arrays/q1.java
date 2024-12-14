import java.util.Scanner;

public class q1 {
    static void reverse(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void evenOdd(int[] nums){
        int st=0;
        int end = nums.length-1;
        while(st<end){
            if(nums[st]%2!=0 && nums[end]%2==0){
                reverse(nums,st,end);
                st++;
                end--;
            }
            if(nums[st]%2==0) st++;
            if(nums[st]%2!=0) end--;
        }
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n= sc.nextInt();
        int[] nums = new int[n];
        
        System.out.print("enter element : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        evenOdd(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
