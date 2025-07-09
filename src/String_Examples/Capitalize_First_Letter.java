package String_Examples;

public class Capitalize_First_Letter {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String result = "";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
                result += capitalized + " ";
            }
        }

        System.out.println("Capitalized Sentence: " + result.trim());
    }
}