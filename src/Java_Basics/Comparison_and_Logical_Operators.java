package Java_Basics;

import java.util.Scanner;

public class Comparison_and_Logical_Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("a == b: "+(a == b)+" a > b: "+( a > b)+" a > b: "+( a > b)+" (a > b) && (a > 0): "+( (a > b) && (a > 0))+" !(a > b): "+( !(a > b)));
    }
}
