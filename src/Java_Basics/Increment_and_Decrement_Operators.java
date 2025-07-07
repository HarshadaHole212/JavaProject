package Java_Basics;

import java.util.Scanner;

public class Increment_and_Decrement_Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();

        System.out.println((++n)+ " Pre-increment: "+(n++)+" Post-increment: "+(--n)+" Pre-decrement: "+(n--)+" Post-decrement: ");
    }
}
