package For_Loop;

import java.util.Scanner;

public class For_Loop_Example_3 {
    public static void main(String[] args) {
        System.out.println("Enter a natural number");
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i=0;i<=num;i++){

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
