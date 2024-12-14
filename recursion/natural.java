import java.util.Scanner;

public class natural {
    static void naturalcount(int n){
        if(n==1) return;
        naturalcount(n-1);
        System.out.print(n+" ");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        naturalcount(n);
    }
}
