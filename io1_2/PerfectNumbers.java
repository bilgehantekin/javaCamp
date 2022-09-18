package kodlama.io1_2;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int term = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                term += i;
            }
        }
        if (number == term) {
            System.out.println(number + " is a perfect number.");
        }
        else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
