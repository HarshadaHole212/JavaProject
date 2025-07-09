package String_Examples;

public class Count_Words_In_String {
    public static void main(String[] args) {
        String str = "Hello to the   world I'm Harshu              ";
        String[] words = str.trim().split("\\s+");  //\\s+ will remove one or more spaces
        int count = words.length;
        System.out.println(count);
    }
}
