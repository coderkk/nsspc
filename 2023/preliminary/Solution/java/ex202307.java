import java.util.Scanner;
import java.lang.Math;

public class ex202307 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        int angle = scan.nextInt();
        scan.close();

        double height = ((double) distance * Math.tan(Math.toRadians(angle))) + 1.8;

        System.out.println(String.format("%.2f", height));
    }
}