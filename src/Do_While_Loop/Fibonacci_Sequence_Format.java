package Do_While_Loop;

public class Fibonacci_Sequence_Format {
    public static void main(String[] args) {
        int num = 7;
        int a = 0, b = 1, count = 0;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < num);
    }
}
