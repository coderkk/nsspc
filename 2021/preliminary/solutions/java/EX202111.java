import java.util.Scanner;

class EX202111 {

    public static boolean isPrimeNumber(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int ans = num;
        for (int i = num; i > 1; i--) {
            if (isPrimeNumber(i)) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}