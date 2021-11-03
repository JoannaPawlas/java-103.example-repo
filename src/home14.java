import java.util.ArrayList;
import java.util.Scanner;

public class home14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę");
        char firstChar = scanner.next().charAt(0);
        System.out.println("Podaj drugą literę");
        char secondChar = scanner.next().charAt(0);

        int distance = secondChar - firstChar;
        System.out.println(distance);


    }
}
