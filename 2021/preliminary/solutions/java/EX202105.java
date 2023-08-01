import java.util.Scanner;

class EX202105 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] Num = new int[N];
        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            Num[i] = num;
        }
        scan.close();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (Num[i] % 2 == 0) ans += 1;
        }

        System.out.println(ans);
    }
}