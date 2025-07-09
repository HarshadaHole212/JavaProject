package String_Examples;


public class Compress_String {
    public static void main(String[] args) {
        String str = "aaabb";
        String result = "";

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1) + String.valueOf(count);
                count = 1;
            }
        }

        // Append the last character and its count
        result += str.charAt(str.length() - 1) + String.valueOf(count);

        System.out.println("Compressed String: " + result);
    }
}

