import java.util.Scanner;
// import java.util.List;
// import java.util.ArrayList;

public class EX202204a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double[] temperatures = new double[n];
        for (int i = 0; i < n; i++) {
            double input = scan.nextDouble();
            temperatures[i] = input;
        }
        scan.close();

        for (int i = 0; i < n; i++) {
            double temperature = temperatures[i];
            double volumn = ((temperature + 273.15) * 2800) / (99 + 273.15);
            System.out.println(String.format("%.7f", volumn));
        }
    }

    // public static void main(String[] args) {
    // List<Double> temperatures = new ArrayList<Double>();
    // Scanner scan = new Scanner(System.in);
    // int n = scan.nextInt();
    // for (int i = 0; i < n; i++) {
    // double input = scan.nextDouble();
    // temperatures.add(input);
    // }
    // scan.close();

    // for (int i = 0; i < temperatures.size(); i++) {
    // double temperature = temperatures.get(i);
    // double volumn = ((temperature + 273.15) * 2800) / (99 + 273.15);
    // System.out.println(String.format("%.7f", volumn));
    // }
    // }
}
