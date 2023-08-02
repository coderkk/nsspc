import java.util.Scanner;
import java.lang.Math;

class EX202107 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int P = scan.nextInt();
        double r = scan.nextDouble();
        int T = scan.nextInt();
        scan.close();

        double A = P;
        int n = 0;

        while (A < T) {
            A = P * Math.pow(1 + r, n+1);
            n++;
        }

        System.out.println(n);
    }
}