package For_Loop;

import java.util.Scanner;

public class For_Loop_Example_7 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //int div=0;
        for (int i=1;i<=num;i++){
            if(num%i == 0){
                System.out.print(i+",");
            }
        }
    }
}
