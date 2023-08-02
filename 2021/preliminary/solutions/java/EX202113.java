import java.util.Scanner;

class EX202113 {

    public static int[] bubleSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] > scores[j+1]) {
                    int tmp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = tmp;
                }
            }
        }
        return scores;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[7];
        for (int i = 0; i < 7; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();

        scores = bubleSort(scores);
        double ans = (double) (scores[2] + scores[3] + scores[4]) / 3;
        System.out.println(String.format("%.2f", ans));
    }
}