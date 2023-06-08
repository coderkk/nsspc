import java.util.Scanner;

class Tests202201 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Invalid input");
            return;
        }

        int start = (num1 < num2) ? num1 : num2;
        int end = (num1 < num2) ? num2 : num1;

        int ans = 0;
        for (int i = start; i <= end; i++) {
            if ((i % 2) == 0)
                ans += i;
        }

        System.out.println(ans);
    }
}