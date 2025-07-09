package String_Examples;

public class swap_two_String {
    public static void main(String[] args) {
        String str1 = "Harshada";
        String str2 = "Mandar";
        str1 = str1 + str2; // str1 = "HelloWorld"

        // Step 2: Extract original str1 from the new str1
        str2 = str1.substring(0, str1.length() - str2.length()); // "Hello"

        // Step 3: Extract original str2 from the new str1
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }
}
