import java.util.Scanner;

class EX202106 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        int ans = 0;
        if (x > y) {
            int tmp = y;
            y = x;
            x = tmp;
        }

        for (int i = x; i <= y; i++) {
            ans += i;
        }


        System.out.println(ans);
    }
}