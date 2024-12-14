import java.util.Scanner;

public class kMultiple {
    static void multiple(int num,int k){
        if(k == 0) return;
        multiple(num,k-1);
        System.out.println(num*k);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num = ");
        int num = sc.nextInt();
        System.out.print("enter k = ");
        int k = sc.nextInt();

        multiple(num,k);
    }
}
