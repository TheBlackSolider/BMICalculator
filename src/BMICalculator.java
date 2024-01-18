import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome To BMI Calculator");
        System.out.println();
        System.out.print("Please Entre Your High :");
        double height = scanner.nextDouble();

        System.out.print("Please Entre Your Weight :");
        double weight = scanner.nextDouble();

        double BMI = weight / (height * height);

        String category;
        if (BMI < 18.5) {
            category = "Underweight";

        } else if (BMI < 25 ) {
            category = "Normal Weight";

        } else if (BMI < 30) {
            category = "Overweight";

        } else {
            category = "Obese";
        }

        System.out.println("Your Body BMI is" +" "  +BMI  + " " + category + ".");
    }


}
