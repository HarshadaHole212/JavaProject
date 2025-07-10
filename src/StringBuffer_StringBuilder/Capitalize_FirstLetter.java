package StringBuffer_StringBuilder;

public class Capitalize_FirstLetter {
    public static void main(String[] args) {

        String s = "i Love java";
        String[] words = s.split(" ");

        StringBuilder cap = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and add remaining letters
                cap.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Remove trailing space
        String finalOutput = cap.toString().trim();

        // Print the result
        System.out.println("Capitalized: " + finalOutput);
    }

}
