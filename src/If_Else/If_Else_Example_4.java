package If_Else;
import java.util.Scanner;

public class If_Else_Example_4 {
    public static void main(String[] args) {
        System.out.println("Enter three sides of a Triangle:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c =scanner.nextInt();

        if (a+b>c && b+c>a && c+a>b) {

            if (a == b && b == c && c == a) {
                System.out.println("Triangle is Equilateral ");
            } else if (a == b || b == c || c == a) {
                System.out.println("triangle is Isosceles ");
            } else {
                System.out.println("Triangle is Scalene ");
            }
        }else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
