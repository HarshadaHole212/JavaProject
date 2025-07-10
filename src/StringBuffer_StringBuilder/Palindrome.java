package StringBuffer_StringBuilder;

public class Palindrome {
    public static void main(String[] args) {

        String s = "madam";
        StringBuilder palindrome = new StringBuilder(s);
        if (s.equals(palindrome.reverse().toString())){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
