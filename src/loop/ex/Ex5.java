package loop.ex;

public class Ex5 {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

        }
    }
}
