package String_Examples;

public class Count_No_Of_Vowels {
    public static void main(String[] args) {
        String str = "Harshada";
        int count = 0;

        str=str.toLowerCase();
        for(int i = 0;i<str.length();i++){

            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
