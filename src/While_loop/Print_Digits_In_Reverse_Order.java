package While_loop;

public class Print_Digits_In_Reverse_Order {
    public static void main(String[] args) {
        int n = 1234;
        int digit;
        while (n>0) {
            digit = n % 10; //this will print the last digit
            System.out.print(digit + " ");
            n = n/10; // This will remove last digit
        }
    }
}
