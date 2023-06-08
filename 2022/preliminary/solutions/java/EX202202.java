import java.util.Scanner;

class EX202202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weigth = scan.nextInt();
        float height = scan.nextFloat();
        scan.close();

        float bmi = weigth / (height * height);

        System.out.println(String.format("%.2f", bmi));
        if (bmi < 20)
            System.out.println("Underweight");
        else if (bmi >= 20 && bmi < 25)
            System.out.println("Healthy Weight");
        else if (bmi >= 25 && bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obesity");
    }
}