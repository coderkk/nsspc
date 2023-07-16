import java.util.Scanner;
import java.lang.Math;

public class EX202207 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float side1 = scan.nextFloat();
        float side2 = scan.nextFloat();
        float side3 = scan.nextFloat();
        scan.close();

        if (((side1 + side2) <= side3) || ((side1 + side3) <= side2) || ((side2 + side3) <= side1)) {
            System.out.println("Invalid");
            return;
        }

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        double area = 0.25 * Math.sqrt(
                (side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3));
        System.out.println(Math.round(area));
    }
}
