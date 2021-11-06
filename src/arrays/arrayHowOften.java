package arrays;

import java.util.Scanner;

public class arrayHowOften {
    public static void main(String[] args) {
        int [] array= {5, 10, 12, 5, 1};
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę, które szukasz");
        int elementOfArray = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            if (elementOfArray == array[i]){
                sum++;

            }

        }
        if (sum>0){
            System.out.println("Element występuję " + sum + " razy");
        }else{
            System.out.println("Element nie występuje!");
        }
    }
}
