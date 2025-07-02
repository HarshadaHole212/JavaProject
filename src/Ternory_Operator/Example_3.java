package Ternory_Operator;

public class Example_3 {
    public static void main(String[] args) {

        int a = 2;
        int b = 1333;
        int c = 66;

        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(max);
    }
}
