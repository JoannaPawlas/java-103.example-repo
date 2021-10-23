import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = scanner.nextInt();
        double counter = 0.0;

        for (int i = n; i > 0; i--){
            counter = counter + (double) 1/i;
            System.out.println(counter);
        }

    }
}
