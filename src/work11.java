import java.util.Scanner;

public class work11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz coś do mnie: ");
        String sentence = scanner.nextLine();
        String end = "Starczy";
        String longestSentence = "";

        if (sentence.equals(end)){
            System.out.println("Użytkowni nic nie napisał");
            return;

        }
        while (!sentence.equals(end)){
            if (sentence.length() > longestSentence.length()) longestSentence = sentence;
            System.out.println("Napisz coś jeszcze");
            sentence = scanner.nextLine();
        }

        System.out.println(longestSentence);


    }
}