package StringBuffer_StringBuilder;

public class Replace_Text {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is bad");
        sb.replace(8,11,"good");
        System.out.println(sb);
    }
}
