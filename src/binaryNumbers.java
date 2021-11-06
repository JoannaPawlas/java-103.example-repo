import java.util.Scanner;

public class binaryNumbers {
    public static void main(String[] args) {

        String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbę n: ");
        int n = scanner.nextInt();






        while(n>0){
            result = pattern.charAt(n%2) + result;
            n /= 2;

            System.out.print(result);
            }





    }
}
