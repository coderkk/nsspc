import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        System.out.println("Please enter your Science and Math mark");
        Scanner scan = new Scanner(System.in);
        int sci = scan.nextInt();
        int math = scan.nextInt();
        scan.close();

        // Solution

        System.out.println("Total marks is : " + (sci + math));
        System.out.println("Average marks is : " + ((double) (sci + math) / 2));
    }
}