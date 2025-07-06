package For_Loop;

import java.util.Scanner;

public class For_Loop_Example_5 {
    public static void main(String[] args) {
        System.out.println("Give me a number I will help you to find factorial of that number: ");
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
         for (int i = (factorial-1); i>=1;i--){
             factorial = factorial * i;
         }
        System.out.print(factorial);
    }
}
//5 = 5*4*3*2*1
