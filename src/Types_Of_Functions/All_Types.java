package Types_Of_Functions;

public class All_Types {
    public static void main(String[] args) {
        No_Praramer_No_WrittenType();
        With_Praramer_No_WrittenType(2,3);
        String msg = No_Praramer_With_WrittenType();
        System.out.println(msg);
        int i = With_Praramer_With_WrittenType(2, 4);
        System.out.println(i);

    }
    static void No_Praramer_No_WrittenType(){
        System.out.println("\nNo_Praramer_NoWrittenType");
    }
    static void With_Praramer_No_WrittenType(int a, int b){
        System.out.println("\nWith_Praramer_No_WrittenType");
        System.out.println(a+b);
    }
    static String No_Praramer_With_WrittenType(){
        System.out.println("\nNo_Praramer_With_WrittenType");
        return "lets return something";
    }

    static int With_Praramer_With_WrittenType(int a,int b){
        System.out.println("\nWith_Praramer_With_WrittenType");
        return a+b;
    }
}
