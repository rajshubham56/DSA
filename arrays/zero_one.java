import java.util.Scanner;
public class zero_one {
    static void reverse(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void sort(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
             if(nums[i]==1 && nums[j]==0){
                reverse(nums,i,j);
                i++;
                j--;
             }
            if(nums[i]==0) i++;
            if(nums[j]==1) j--;
            }
        }
        
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[n];
        System.out.print("enter n :");
        int n= sc.nextInt();
        System.out.print("enter element : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
        // int ans[]=sort(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
