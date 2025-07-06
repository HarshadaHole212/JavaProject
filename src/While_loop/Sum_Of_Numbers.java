package While_loop;

import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n>0){
            sum = sum+n;
            n--;
        }
        System.out.println(sum);
    }
}
