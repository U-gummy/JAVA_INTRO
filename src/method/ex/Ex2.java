package method.ex;

public class Ex2 {
    public static void main(String[] args) {
        String message = "Hello, world!";


        addString(message, 3);
        addString(message, 5);
        addString(message, 7);
    }

    public static void addString(String s, int num) {

        for (int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }

}
