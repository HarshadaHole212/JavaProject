package String_Examples;

public class Anagram_Check {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Simple sorting without Arrays.sort
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
                if (arr2[i] > arr2[j]) {
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);

        if (sorted1.equals(sorted2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}

