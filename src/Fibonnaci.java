import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int number3 = scanner.nextInt();
        int i = number3;
        int counter = number3;

        System.out.print(number1 + " " + number2);

        for (i = 2; i < counter; ++i)
        {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;

        }


    }
}