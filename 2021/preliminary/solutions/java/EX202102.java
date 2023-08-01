import java.util.Scanner;
import java.lang.Math;

class EX202102 {

    final static double g = 9.8;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double h = scan.nextDouble();
        scan.close();

        double ans = Math.sqrt(  (2 * h) / g);

        System.out.println(String.format("%.2f", ans));
    }
}