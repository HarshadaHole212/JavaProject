package String_Examples;

public class Character_Frequency {
    public static void main(String[] args) {
        String str = "Heelloo";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == i) { // count only first occurrence
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + ": " + count);
            }
        }
    }
}
