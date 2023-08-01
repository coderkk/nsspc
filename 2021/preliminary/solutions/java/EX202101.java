import java.util.Scanner;

class EX202101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        scan.close();

        int ans = a;
        for (int i = 0; i < n; i++) {
            ans = (5 * ans) + 7;
        }

        System.out.println(ans);
    }
}