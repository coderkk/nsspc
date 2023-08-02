import java.util.Scanner;

class EX202114 {

    public static boolean haveDecimal(double num) {
        // boolean check = false;
        // num  = Math.abs(num);
        // int numToInt = (int) num;
        // check = ((num - numToInt) != 0);
        // return check;

        return (num != Math.floor(num));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        
        double c = (double) ((4 * x) - y) / 2;
        double r = (double) x - c;

        if ((haveDecimal(c) || haveDecimal(r)) || (c < 0 || r < 0)) {
            System.out.println("No feasible solution");
        } else {
            System.out.println((int) c);
            System.out.println((int) r);
        }
    }
}