package Ternory_Operator;

public class Example_7 {
    public static void main(String[] args) {
        int num = 81;
        String s = (num>100)?"invalid":(num>=90)? "A" :  (num>=80)? "B": (num>=70) ? "C":"D";
        System.out.println(s);
    }
}
