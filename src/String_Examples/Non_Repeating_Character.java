package String_Examples;

public class Non_Repeating_Character {
    public static void main(String[] args) {

                String str = "bnjhhb vgiuhkjbkjl";
                str = str.toLowerCase(); // Optional: to handle case-insensitivity

                boolean found = false;

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    // Check if first and last occurrence of character is the same
                    if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                        System.out.println("First non-repeating character: " + ch);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No non-repeating character found.");
                }
            }
        }
