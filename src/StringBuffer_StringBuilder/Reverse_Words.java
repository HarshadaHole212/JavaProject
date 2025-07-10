package StringBuffer_StringBuilder;

public class Reverse_Words {
    public static void main(String[] args) {
        String str = "I love java";
        String[] words = str.split(" ");

        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i != 0) {
                reverse.append(" "); // add space between words
            }
        }

        System.out.println(reverse);

    }
}
