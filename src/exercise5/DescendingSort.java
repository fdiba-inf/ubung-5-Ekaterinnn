package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length - 1; index++) {
           int maxIndex = index;

           for (int i = index + 1; i < numbers.length; i++) {
<<<<<<< HEAD
             if (numbers[minIndex] < numbers[i]) {
               minIndex = i;
=======
             if (numbers[maxIndex] > numbers[i]) {
               maxIndex = i;
>>>>>>> 695230f288bd97700152c12143bf7e5816979e1a
             }
           }

           int temp = numbers[index];
           numbers[index] = numbers[maxIndex];
           numbers[maxIndex] = temp;
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
