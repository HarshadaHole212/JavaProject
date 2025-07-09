package String_Examples;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String palindrome= "";
        for (int i = str.length()-1;i>=0;i--){
            palindrome = palindrome+str.charAt(i);
        }
        if (str.equals(palindrome)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not a Palindrome String");
        }
    }
}
