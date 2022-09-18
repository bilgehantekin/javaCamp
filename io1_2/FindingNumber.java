package kodlama.io1_2;

import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        int [] numbers = new int[] {1, 2, 5, 7, 9, 0};

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        boolean isExist = false;

        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                isExist = true;
                break;
            }
        }
        if (isExist)
            System.out.println(input + " is in this array.");
        else
            System.out.println(input + " is not in this array.");
    }
}
