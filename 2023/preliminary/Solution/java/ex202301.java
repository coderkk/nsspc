import java.util.Scanner;

public class ex202301 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();

        int ans = c / d;
        ans += (ans / a) * b;

        System.out.println(ans);
    }
}