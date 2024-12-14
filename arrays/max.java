import java.util.Scanner;

public class max {
   static int maxElements(int[] arr){
    int max = Integer.MIN_VALUE;
    int sMax=Integer.MIN_VALUE;
    for(int i=0; i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
             
        }
    }
    // for(int i=0;i<arr.length;i++){
    //     if(max<arr[i]){
    //         max=arr[i];
    //     }
    // }
    // for(int i=0;i<arr.length;i++){
    //     if(max!=arr[i] && sMax<arr[i]){
    //         sMax=arr[i];
    //     }
    // }
    return sMax; 
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("enter all elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int ans = maxElements(arr);
        System.out.println(ans);
    }
    
}
