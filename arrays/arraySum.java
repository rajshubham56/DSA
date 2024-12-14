import java.util.Scanner;

public class arraySum {
    static int sum(int[] arr){
        int _sum=0;
        for(int i=0;i<arr.length;i++){
            _sum += arr[i];
        }
        return _sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter element of array : ");
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        int ans=sum(arr);
        System.out.println(ans);
    }
}
