package StringBuffer_StringBuilder;

public class Remove_Duplicate_Char {
    public static void main(String[] args) {
        String input = "aaaabbbbcccc";

        // Use StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Handle edge case: empty string
        if (input.length() == 0) {
            System.out.println("Output: " + result.toString());
            return;
        }

        // Add the first character
        result.append(input.charAt(0));

        // Iterate through the rest of the string
        for (int i = 1; i < input.length(); i++) {
            // Append character only if it's different from the previous one
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        // Print the final result
        System.out.println("Output: " + result.toString());
    }
}
