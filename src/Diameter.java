import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj średnicę okręgu: ");

        float diameter = scanner.nextFloat();

        float pi = (float) Math.PI;


        float circleField = diameter * pi;
        System.out.println("Dla podanej średnicy, pole koła wynosi: " + circleField);








    }
}
