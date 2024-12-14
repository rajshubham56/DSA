import java.util.Scanner;
public class prefix {
    static void _prefix(int[] nums){
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i] = nums[i]+nums[i-1];
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter value of element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // int ans[] =_prefix(arr);
        _prefix(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
}
