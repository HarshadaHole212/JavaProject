package Input_From_User;

import java.util.Scanner;

public class Input_Example_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int n = scanner.nextInt();
        System.out.println(n);

        System.out.println("Enter String:");
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter float:");
        float f = scanner.nextFloat();
        System.out.println(f);

        System.out.println("Enter Double:");
        double d = scanner.nextDouble();
        System.out.println(d);
    }
}
