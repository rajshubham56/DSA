import java.util.Scanner;

public class nonDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter value of element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans =sort_array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        } 
    }
}
