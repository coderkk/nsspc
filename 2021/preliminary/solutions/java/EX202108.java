import java.util.Scanner;

class EX202108 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();

        int ans = 0;
        String[] textArray = text.toLowerCase().split("");
        for (int i = 0; i < textArray.length; i++) {
            String c = textArray[i];
            if (c.equals("a") ||
                    c.equals("e") ||
                    c.equals("i") ||
                    c.equals("o") ||
                    c.equals("u") )  {
                ans++;
            }
        }
        System.out.println(ans);
    }
}