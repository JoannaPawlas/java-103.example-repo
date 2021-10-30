import java.io.Console;
import java.util.Scanner;

public class home5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią");
        int number = scanner.nextInt();

        printPrimes (number);


        }



        public static boolean isItPrime (int number){
        for (int i = 2; i < number - 1; i++){
            if (number % i == 0 ){
                return false;
            }
        }
        return true;

        }
        public static void printPrimes (int number){
        for (int i = 2; i < number; i++){
            if (isItPrime(i)){
                System.out.print(i + ", ");
            }

        }
        }



    }



