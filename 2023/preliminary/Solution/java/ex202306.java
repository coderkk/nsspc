import java.util.Scanner;

public class ex202306 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();

        double win_rate = (double) c / d;

        long p = -1;
        for (long i = 0; i <= 1000000; i++) {
            double estimate_win_rate = (double) (a + i) / (b + i);
            if (win_rate <= estimate_win_rate) {
                p = i;
                break;
            }
        }

        System.out.println(p);
    }
}