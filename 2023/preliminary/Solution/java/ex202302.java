import java.util.Scanner;

public class ex202302 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int no_of_students = scan.nextInt();
        int no_of_groups = scan.nextInt();
        scan.close();

        String ans = "";
        for (int i = 1; i <= no_of_students; i++) {
            if ((i % no_of_groups) == 0) {
                if (!ans.equals("")) ans += " ";
                ans += String.valueOf(i);
            }
        }

        System.out.println(ans);
    }
}
