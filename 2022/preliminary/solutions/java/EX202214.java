import java.util.Scanner;

public class EX202214 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] rectSize = line.split(" ");
        int r = Integer.parseInt(rectSize[0]);
        int c = Integer.parseInt(rectSize[1]);

        String[][] rect = new String[r][c];
        for (int i = 0; i < r; i++) {
            line = scan.nextLine();
            String[] rectCols = line.split(" ");
            for (int j = 0; j < c; j++) {
                rect[i][j] = rectCols[j];
            }
        }
        scan.close();

        int ans = 0;
        int size = 0;
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                // System.out.println(rect[i][j]);
                if (rect[i][j].equals("1")) {
                    size = 1;
                    int col = j;
                    int row = i;
                    boolean detect = true;
                    while (detect) {
                        col++;
                        row++;
                        if (col >= c || row >= r) {
                            detect = false;
                        }
                        if (detect) {
                            for (int pos = i; pos < row; pos++) {
                                if (rect[pos][col].equals("0")) {
                                    detect = false;
                                    break;
                                }
                            }
                        }

                        if (detect) {
                            for (int pos = j; pos < col; pos++) {
                                if (rect[row][pos].equals("0")) {
                                    detect = false;
                                    break;
                                }
                            }
                        }
                        if (detect)
                            size++;
                    }
                }
                if (size > 1 && ans < size)
                    ans = size;
            }
        }
        System.out.println(ans);
    }

}