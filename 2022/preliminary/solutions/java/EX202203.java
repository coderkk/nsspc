import java.util.Scanner;

public class EX202203 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        int size = input.length();
        String tempType = input.substring(size - 1, size);
        float tempValue = Float.parseFloat(input.substring(0, size - 1));

        float result = 0;
        if (tempType == "C") {
            result = ((9 / 5) * tempValue) + 32;
        } else {
            result = (tempValue - 32) * 5 / 9;
        }

        System.out.println(String.format("%.1f", result) + ((tempType == "C") ? "F" : "C"));
    }

}
