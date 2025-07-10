package StringBuffer_StringBuilder;

public class Delete_Character {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Harshada");
        sb.delete(11,14);
        sb.insert(11,"u");
        System.out.println(sb);
    }
}
