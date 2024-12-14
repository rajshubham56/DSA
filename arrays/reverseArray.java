import java.util.*;
public class reverseArray {
    static void swapInArray(int[] arr,int start,int end){
        int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
         
    } 
    static int[] reverse(int[] arr){
        int start = 2;
        int end = 4;
        while(start<end){
            swapInArray(arr,start,end);
            start++;
            end--;
        }
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
        int ans[] =reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
