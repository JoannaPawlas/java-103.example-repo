import java.rmi.server.ObjID;
import java.util.Scanner;

public class home10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");;
        int bigNumber = scanner.nextInt();
        scanner.close();

        int result = 0;
        while (bigNumber != 0){
            result += bigNumber%10;
            bigNumber /= 10;



        }

        System.out.println("Suma cyfr podanej przez użytkowanika liczby wynobi: " + result);











    }




    }

