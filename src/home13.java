import java.util.Scanner;

public class home13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Powiedz coś do mnie: ");
        String someText = scanner.nextLine();


        String [] someTexts = someText.split(" ");
        for (String stammer: someTexts)
            System.out.printf(stammer+ " " + stammer + " ");



    }
}
