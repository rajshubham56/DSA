import java.util.Scanner;

public class prefixq1 {
    static void _prefix(int[] nums,int l,int r){
        int n=nums.length;
        for(int i=l+1;i<=r;i++){
            nums[i]=nums[i]+nums[i-1];
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
        _prefix(arr,2,4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
}
