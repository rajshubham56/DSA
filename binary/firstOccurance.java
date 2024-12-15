import java.util.Scanner;

public class firstOccurance {
    static int binary_search(int[] nums,int st,int end,int target){
        int fo=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target){
                fo=mid;
                st = mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return fo;
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
        int ans = binary_search(nums,0,n-1,target);
        System.out.print(ans);
    }
}
