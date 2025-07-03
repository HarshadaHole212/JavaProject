package If_Else;

import java.util.Scanner;

public class If_Else_Example_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
