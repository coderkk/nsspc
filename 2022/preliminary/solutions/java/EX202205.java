import java.util.Scanner;

public class EX202205 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        int size = input.length();
        if (size > 100) {
            System.out.println("Invalid Length");
            return;
        }

        int result = 0;
        String[] stringArray = input.split("");
        for (int i = 0; i < size; i++) {
            String c = stringArray[i];
            switch (c) {
                case "B":
                case "b":
                    result += 2;
                    break;
                case "C":
                case "c":
                    result += 3;
                    break;
                case "E":
                case "e":
                    result += 5;
                    break;
                case "G":
                case "g":
                    result += 7;
                    break;
                case "K":
                case "k":
                    result += 11;
                    break;
                case "M":
                case "m":
                    result += 13;
                    break;
                case "Q":
                case "q":
                    result += 17;
                    break;
                case "S":
                case "s":
                    result += 19;
                    break;
                case "W":
                case "w":
                    result += 23;
                    break;
            }
        }

        System.out.println(result);
    }
}