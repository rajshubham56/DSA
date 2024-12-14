import java.util.Scanner;

public class digitSum {
    static int sum(int d){
        if(d % 10 == 0) return d;
        int ans = d%10 + sum(d/10);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        
        int ans = sum(n);
        System.out.print(ans);
    }
}
