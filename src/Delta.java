import java.util.Scanner;

public class Delta {


    private static double delta1;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = scanner.nextInt();

        double Delta = Delta (a, b, c);
        System.out.println(Delta);
        double x1 = x1(a, b, Delta);
        System.out.println(x1);
        double x2 = x2(a, b, Delta);
        System.out.println(x2);
        System.out.println("Wynik działania kwadratowego");






    }

    static double Delta (int a, int b, int c) {
        double resultDelta1 = (Math.pow(b, 2)) - (4 * a * c);
        return resultDelta1;



    }
    static double x1 (int a, int b, double Delta){
        double x1 = (-b - Math.sqrt(Delta)) / (2*a);
        return x1;

    }
    static double x2 (int a , int b, double Delta){
        double x2 = (-b + Math.sqrt(Delta)) / (2*a);
        return x2;

    }


    }












