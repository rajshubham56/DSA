import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.print("ans = "+ans);
    }
}
