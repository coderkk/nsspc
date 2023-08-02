import java.util.Arrays;
import java.util.Scanner;

class EX202113a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[7];
        for (int i = 0; i < 7; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();
        
        Arrays.sort(scores);
        double ans = (double) (scores[2] + scores[3] + scores[4]) / 3;
        System.out.println(String.format("%.2f", ans));
    }
}