import java.util.Scanner;

public class occurance {
    static int lastOccurence(int[] nums, int x){
        int count = -1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==x){
            count = i;
           }
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int [5];
    System.out.print("enter x : ");
    int x = sc.nextInt();
    
    System.out.print("enter elements of array : "); 
    for(int i=0;i<arr.length;i++){
        arr [i] = sc.nextInt();
    }
   int ans = lastOccurence(arr,x);
    System.out.print("NUMBER OF ELEMENT OCCURENCE :"+ans);


}
}
