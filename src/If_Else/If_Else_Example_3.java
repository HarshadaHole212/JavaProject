package If_Else;

import java.util.Scanner;

public class If_Else_Example_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = scanner.nextInt();
        if (marks > 100) {
            System.out.println("marks should be between 1 to 100");
        } else if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}
