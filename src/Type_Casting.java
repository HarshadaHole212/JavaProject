import java.net.StandardSocketOptions;

public class Type_Casting {
    public static void main(String[] args) {
        byte a=10;
        int b = a;  //Widening -> (implicit)

        byte c = 99;
        int d = (int) c; // Widening -> (Explicit)

        System.out.println(a+","+b+","+c+","+d);

        int e = 999;
        byte f = (byte) a;    //Narrowing -> Explicit also "data loss" happens in narrowing.

        System.out.println(e+","+f);



    }
}
