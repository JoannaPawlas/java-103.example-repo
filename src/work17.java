import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class work17 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiedy masz kolejne zajęcia: ");
        String dateClass = scanner.nextLine();

        LocalDate dateOfClasses = LocalDate.parse(dateClass);

        int timeBetween = (int) ChronoUnit.DAYS.between(LocalDate.now(), dateOfClasses);
        System.out.println("Do kolejnych zajęć pozostało: " + timeBetween + " dni.");


    }
}
