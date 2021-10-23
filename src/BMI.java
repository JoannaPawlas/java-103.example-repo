import java.sql.SQLOutput;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile ważysz: ");
        float weight = scanner.nextFloat();
        System.out.println("Podaj ile masz wzrostu: ");
        int height = scanner.nextInt();

        float heightInMeters = (float) heightInMeters(height);

        float heightToSquare = heightToSquare(heightInMeters);

        float BMI = BMIMethod(weight, heightToSquare);

        System.out.println(BMI);

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI optymalne");
        }else{
            System.out.println("BMI nieoptymalne");
        }









    }
    public static float BMIMethod (float weight, float heightSquare){
        float BMI = weight / heightSquare;
        return BMI;

    }
    public static double heightInMeters (int height){
        double heightInMeters = height * 0.01;
        return heightInMeters;
    }
    public static float heightToSquare (double heightInMeters){
        double heightToSquare = Math.pow(heightInMeters, 2);
        return (float) heightToSquare;

    }
}
