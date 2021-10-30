import java.util.Scanner;

public class home12 {
    public static void main(String[] args) {
        String someText = new String("There something odd about you");
        int lenght = someText.length();
        System.out.println("Liczba wszystkich znaków to: "+lenght);
        int spaces = someText.indexOf(" ");
        System.out.println("Liczba samych spacji to: "+spaces);

        System.out.println (howManySpaces(lenght, spaces));







    }

    public static double howManySpaces (int lenght, int spaces){
        return (spaces/lenght)*100;



    }

}
