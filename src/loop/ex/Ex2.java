package loop.ex;

public class Ex2 {
    public static void main(String[] args) {
        for (int i = 2, count = 1; count <= 10; i += 2, count++) {
            System.out.println(i);

        }

        System.out.println();
        System.out.println();

        int count = 1;
        int i = 2;

        while (count <= 10) {
            System.out.println("i :" + i);
            i += 2;
            count++;
        }
    }
}
