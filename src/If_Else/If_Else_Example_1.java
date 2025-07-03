package If_Else;

import java.util.Scanner;

public class If_Else_Example_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = scanner.nextInt();

        if(num>0){
            System.out.println("It's a positive number ");
        } else if (num == 0) {
            System.out.println("It's a zero ");
        }else
        {
            System.out.println("It's a negative number ");
        }
    }
}
