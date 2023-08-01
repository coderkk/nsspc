import java.util.Scanner;
import java.lang.Math;

class EX202104 {

    final static double pi = 3.14;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double h = scan.nextDouble();
        scan.close();

        double A = 2 * pi * r * h + 2 * pi * Math.pow(r, 2);

        System.out.println(String.format("%.2f", A));
    }
}