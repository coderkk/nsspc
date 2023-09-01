import java.util.Scanner;

public class ex202305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthday = scan.nextInt();
        int no_of_colours = scan.nextInt();
        scan.close();

        int ans = (int) birthday % no_of_colours;

        System.out.println("C" + String.valueOf(ans + 1));
    }
}