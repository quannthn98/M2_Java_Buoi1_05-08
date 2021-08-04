import java.util.Scanner;

public class tinhBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Input your weight (kg)");
        weight = sc.nextDouble();
        if (weight < 0) {
            System.out.println("please Input valid weight (> 0m and < 3m)");
            weight = sc.nextDouble();
        }
        System.out.println("Input your height (meter)");
        height = sc.nextDouble();
        if (height < 0 || height > 3) {
            System.out.println("please Input valid height (> 0 at least)");
            height = sc.nextDouble();
        }
        double bmi = weight / (height * height);
        System.out.println("Your BMI: " + bmi);
        if (bmi > 0 && bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi < 25) {
            System.out.println("You are Normal");
        } else if (bmi < 30) {
            System.out.println("you are Overweight");
        } else if (bmi > 30){
            System.out.println("you are Obese");
        } else {
            System.out.println("Invalid input");
        }
    }
}
