import java.util.*;
public class rotateArray {
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;    
            i++;
            j--;
        }
    }
    static int[] rotate_array(int[] arr,int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        return arr;
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
        int[] ans =rotate_array(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        } 
    }
}