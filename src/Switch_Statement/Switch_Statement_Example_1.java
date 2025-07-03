package Switch_Statement;

import java.util.Scanner;

public class Switch_Statement_Example_1 {
    public static void main(String[] args) {
        System.out.println("Enter an number between 1 to 7 and I will tell you which day it is");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch(a){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Enter number between 1 to 7 only");
            }
        }
    }
}
