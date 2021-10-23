import java.util.Scanner;

public class homeCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        float number1 = scanner.nextInt();
        System.out.println("Użyj znaku działania: ");
        String operator = scanner.next();
        System.out.println("Podaj drugą liczbę: ");
        float number2 = scanner.nextInt();
        while (operator.equals("+")){
           System.out.println("wynik dodawania wynosi: " + summing(number1, "+", number2));
           break;
        }while(operator.equals("-")) {
            System.out.println("wynik odejmowania wynosi: " + substraction(number1, "-", number2));
            break;
        }while(operator.equals("*")) {
            System.out.println("wynik mnożenia wynosi: " + mutliplying(number1, "*", number2));
            break;
        }while(operator.equals("/")) {
            System.out.println("wynik dzielenia wynosi: " + diversion(number1, "/", number2));




        }




    }
    public static float summing (float number1, String operator, float number2){
        float result = number1 + number2;
        return result;

    }

    public static float mutliplying (float number1, String operator, float number2){
        float result = number1 * number2;
        return result;
    }
    public static float substraction (float number1, String operator, float number2){
        float result = number1 - number2;
        return result;

    }
    public static float diversion (float number1, String operator, float number2){
        float result = number1 / number2;
        return result;

    }




}
