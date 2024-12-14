import java.util.Scanner;

public class arrayManipulation {
    static int arrayMani(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i]=-1;
                    nums[j]=-1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 ){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("enter element : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int ans = arrayMani(nums);
        System.out.print(ans);

    }
}
