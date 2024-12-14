import java.util.Scanner;

public class power2 {
    static int pow(int p,int q){
        if(q==0) return 1;
        if(q==1) return p;
        if(q % 2==0){
            int ans = pow(p,q/2) * pow(p,q/2);
            return ans;
        }else{
            int ans = p * pow(p,q/2) * pow(p,q/2);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter p = ");
        int p = sc.nextInt();
        System.out.print("enter q = ");
        int q = sc.nextInt();
        
        int ans = pow(p,q);
        System.out.print(ans);
    }
}
