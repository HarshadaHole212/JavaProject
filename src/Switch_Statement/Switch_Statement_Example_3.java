package Switch_Statement;

import java.util.Scanner;

public class Switch_Statement_Example_3 {
    public static void main(String[] args) {
        System.out.println("Enter any Character: ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().toLowerCase().charAt(0);

        if (c>='a' && c<='z') {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u': {
                    System.out.println("Vowel");
                    break;
                }
                default: {
                    System.out.println("Consonant");
                }

            }
        }else {
            System.out.println("Enter valid input");
        }
    }
}
