package For_Loop;

public class For_Loop_Star_Triangle {
    public static void main(String[] args) {
        int rows= 4;

        for (int i = 1; i <= rows; i++) {
            // Print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
        }
    }
