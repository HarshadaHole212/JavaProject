package For_Loop;

import java.util.Scanner;

public class For_Loop_Example_4 {
    public static void main(String[] args) {
        System.out.println("Which multiplication table do you want");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int mul = 0;
        for (int i = 1;i<=10;i++){
            mul = num * i;
            System.out.println(mul);
        }
    }
}
