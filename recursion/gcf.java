import java.util.Scanner;

public class gcf {
    static int multiple(int n,int m){
        if(n%m== 0) return m;
        int ans = multiple(m,n%m);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.print("enter m = ");
        int m = sc.nextInt();

        int ans = multiple(n,m);
        System.out.println(ans);
    }
}
