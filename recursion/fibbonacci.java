import java.util.Scanner;

public class fibbonacci {
    static int fibbo(int n){
        if(n==1 || n==2) return n;
        int ans = fibbo(n-1) + fibbo(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        
        int ans = fibbo(n);
        System.out.print(ans);
    }
}
