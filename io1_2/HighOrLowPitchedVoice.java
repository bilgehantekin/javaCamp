package kodlama.io1_2;

import java.util.Scanner;

public class HighOrLowPitchedVoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an alphabetic character: ");
        char character = scan.next().toLowerCase().charAt(0);

        if (character == 'a' || character == 'ı' || character == 'o' || character == 'u')
            System.out.println("Your character is high pitched voice.");
        else if (character == 'e' || character == 'i' || character == 'ö' || character == 'ü')
            System.out.println("Your character is low pitched voice.");
        else
            System.out.println("Your character consonant.");
    }
}
