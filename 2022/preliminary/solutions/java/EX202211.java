import java.util.Scanner;
import java.lang.Math;

public class EX202211 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        scan.close();

        String[] nArray = N.split("");
        String newN = nArray[1] + nArray[3] + nArray[2] + nArray[0];
        double number = Math.pow(Double.parseDouble(newN), 4);
        String numberString = String.format("%d", (long) Math.floor(number));
        String otp = numberString.substring(numberString.length() - 6, numberString.length());
        
        System.out.println(otp);
    }
}
