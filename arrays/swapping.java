import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A :");
        int a = sc.nextInt();
        System.out.print("B :");
        int b = sc.nextInt();
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    }
}
