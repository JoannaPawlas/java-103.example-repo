import java.util.Scanner;

public class home4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj dowolną liczbę dodatnią: ");

        int numberFromUser = scanner.nextInt();
        for (int i = 0; i <= numberFromUser; i++){
            if (i%3 == 0 && i%7 == 0) {
                System.out.println("pif paf");
            }else if (i%7 == 0){
                System.out.println("paf");
            }else if (i%3 == 0){
                System.out.println("pif");
            }else {
                System.out.println(i);
            }





        }
    }
}
