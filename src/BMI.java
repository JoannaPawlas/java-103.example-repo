import java.sql.SQLOutput;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile ważysz: ");
        float weight = scanner.nextFloat();
        System.out.println("Podaj ile masz wzrostu: ");
        int height = scanner.nextInt();
        double height2 = height * 0.01;

        float heightSquare = (float) Math.pow(height2, 2);

        float BMI = weight/heightSquare;
        System.out.println(BMI);
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI optymalne");
        }else{
            System.out.println("BMI nieoptymalne");
        }





    }
}
