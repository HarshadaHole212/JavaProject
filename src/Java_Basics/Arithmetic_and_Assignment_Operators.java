package Java_Basics;

import java.util.Scanner;

public class Arithmetic_and_Assignment_Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Addition: "+(num1+num2)+" Subtraction: "+(num1-num2)+" Multiplication: "+(num1*num2)+" Division: "+(num1/num2)+" Modulus: "+(num1%num2));
    }
}
