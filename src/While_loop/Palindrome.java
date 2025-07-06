package While_loop;

public class Palindrome {
    public static void main(String[] args) {
        int num = 10101;
        int number = num;
        int palindrome = 0;
        while (num > 0) {
            int digit = num % 10;
            palindrome = palindrome * 10 + digit;
            num = num / 10;
        }

        System.out.println(palindrome);

        if (number == palindrome){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not a Palindrome number");
        }
    }
}
