import java.util.Scanner;

class EX202115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String symbol = scan.next();
        scan.close();
        
        for (int i = 0; i < N; i++) {
            System.out.println( " ".repeat(N - i - 1) + symbol.repeat(2 * (i + 1) -1) );
        }
        for (int i = 0; i < N; i++) {
            System.out.println( " ".repeat(N - 1) + symbol);
        }
    }
}