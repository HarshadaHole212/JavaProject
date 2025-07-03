package Ternory_Operator;

public class Ternory_Example_5 {
    public static void main(String[] args) {
        int year = 2025;
        String str = (year%4 == 0)? (year%100 != 0)? "Leap year" : ((year%400==0)?"Leap year":"not a leap year"):"Not a leap year ";
        System.out.println(str);
    }
}
