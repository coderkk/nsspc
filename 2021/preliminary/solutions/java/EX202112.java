import java.util.Scanner;

class EX202112 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Long N = scan.nextLong();
        scan.close();

        long ans = N;
        
        while (ans > 9) {
            String text = String.valueOf(ans);
            ans = 0;
            String[] textArray = text.split("");
            for (int i = 0; i < textArray.length; i++) {
                int num = Integer.parseInt(textArray[i]);
                ans += num;
            }
        }

        System.out.println(ans);
    }
}