import java.util.Scanner;

public class Euklides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scanner.nextInt();


        while(a!=b){
            if (a<b)
                b -= a;
            else
                a -= b;


        }
        System.out.println("Największy wspolny dzielnik a i b to: "+ a);

    }
}
