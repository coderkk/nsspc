import java.util.Scanner;
import java.lang.Math;

public class EX202206 {
    public static void main(String agrs[]) {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();

        double x1 = ((m + 2) + Math.sqrt(Math.pow((m + 2), 2) + (4 * (c + 3)))) / 2;
        double x2 = ((m + 2) - Math.sqrt(Math.pow((m + 2), 2) + (4 * (c + 3)))) / 2;

        double y1 = (m * x1) + c;
        double y2 = (m * x2) + c;

        if (x1 == x2 && y1 == y2) {
            x2 = Double.NaN;
            y2 = Double.NaN;
        }

        int count = 0;
        if (!(Double.isNaN(x1) && Double.isNaN(y1)))
            count++;
        if (!(Double.isNaN(x2) && Double.isNaN(y2)))
            count++;

        if (count == 1) {
            System.out.println("One intersection");
        } else if (count == 2) {
            System.out.println("Two intersections");
        } else {
            System.out.println("No intersection");
        }

        if (!Double.isNaN(x1) && !Double.isNaN(y1))
            System.out.println(String.format("%.7f, %.7f", x1, y1));
        if (!Double.isNaN(x2) && !Double.isNaN(y2))
            System.out.println(String.format("%.7f, %.7f", x2, y2));

    }
}