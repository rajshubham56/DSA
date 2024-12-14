import java.util.Scanner;
public class secondMax {
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int[] arr){
        int max = findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int smax = findMax(arr);
        return smax;
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
        int smax=secondMax(arr);
        System.out.println(smax);

    }
}
