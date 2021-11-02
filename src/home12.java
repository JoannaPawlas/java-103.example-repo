import java.util.Scanner;

public class home12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz coś do mnie: ");
        String someText = scanner.nextLine();


        int lenght = someText.length();
        System.out.println("Liczba wszystkich znaków to: "+lenght);
        int spaces = someText.indexOf(" ");
        System.out.println("Liczba samych spacji to: "+spaces);

        System.out.println("Procentowy udział spacji to: " + howManySpaces(lenght, spaces));







    }

    public static float howManySpaces (int lenght, int spaces){
        float manySpaces = (float) spaces/(float)lenght * 100;
        return manySpaces;





    }

}
