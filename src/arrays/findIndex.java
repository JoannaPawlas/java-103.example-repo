package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakiej liczby szukasz: ");
        int searchedNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchedNumber) {
                System.out.println("szukana liczba " + searchedNumber + " znajduje się pod indeksem " + i);
                return;

            }
        }
        System.out.println("szukanej liczby nie ma w tablicy "+searchedNumber);
    }
}




