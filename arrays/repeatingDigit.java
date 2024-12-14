import java.util.Scanner;
public class repeatingDigit{
    static int findDigit(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
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
        int ans =findDigit(arr);
        System.out.print(ans);
    }
}