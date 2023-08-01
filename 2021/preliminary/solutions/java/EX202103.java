import java.util.Scanner;

class EX202103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if ((N % i) == 0) ans += i;
        }

        System.out.println(ans);
    }
}