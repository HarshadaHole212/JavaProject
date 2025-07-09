package String_Examples;

public class Reverse_Function {
    public static void main(String[] args) {
        String S = "Hello Harshu";
        String reverse = "";

        for (int i = (S.length()-1);i>= 0;i--){
            reverse = reverse+S.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(S);
    }
}
