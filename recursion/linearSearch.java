import java.util.Scanner;

public class linearSearch {
    static boolean linear_Search(int[] nums,int k,int idx){
        if(idx >= nums.length) return false;
        if(nums[idx] == k) return true;
        return linear_Search(nums,k,idx+1);
        
        
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
        System.out.print("enter k");
        int k = sc.nextInt();
        if(linear_Search(nums,k,0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
