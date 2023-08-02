import java.util.Arrays;
import java.util.Scanner;

class EX202108a {
    public static void main(String[] args) {

        String[] vowels = { "a", "e", "i", "o", "u" };

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();

        int ans = 0;
        String[] textArray = text.toLowerCase().split("");
        for (int i = 0; i < textArray.length; i++) {
            int index = Arrays.binarySearch(vowels, textArray[i]);
            if (index >= 0)  {
                ans++;
            }
        }
        System.out.println(ans);
    }
}