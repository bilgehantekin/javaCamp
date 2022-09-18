package kodlama.io1_2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int temp = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                temp++;
            }
        }

        if (temp == 2) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
