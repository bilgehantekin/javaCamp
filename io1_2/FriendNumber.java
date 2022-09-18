package kodlama.io1_2;

import java.util.Scanner;

public class FriendNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();

        int term1 = 0;
        int term2 = 0;

        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                term1 += i;
            }
        }
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                term2 += i;
            }
        }
        if (num1 == term1 && num2 == term2) {
            System.out.println(num1 + " and " + num2 + " are friend numbers.");
        }
        else {
            System.out.println(num1 + " and " + num2 + " are not friend numbers.");
        }
    }
}
