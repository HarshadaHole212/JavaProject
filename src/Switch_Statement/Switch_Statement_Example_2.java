package Switch_Statement;

import java.util.Scanner;

public class Switch_Statement_Example_2 {
    public static void main(String[] args) {
        System.out.println("Enter 2 number and which operation you want to perform on those numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char s = scanner.next().charAt(0);

        switch (s){
            case '+' : {
                System.out.println("You have selected addition operator and answer is : "+(a+b));
                break;
            }
            case '-' : {
                System.out.println("You have selected substraction operator and answer is : " +(a-b));
                break;
            }
            case '*' :{
                System.out.println("You have selected multiplication operator and answer is : "+(a*b));
                break;
            }
            case '/' :{
                System.out.println("You have selected division operator and answer is : "+a/b);
                break;
            }
            case '%' :{
                System.out.println("You have selected modulus operator and answer is : "+a%b);
                break;
            }
            default:{
                System.out.println("Enter valid input");
            }
        }
    }
}
