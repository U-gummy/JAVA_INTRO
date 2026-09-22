package method.ex;

public class Ex1 {
    public static void main(String[] args) {
        double a1 = average(1, 2, 3);
        double a2 = average(10, 20, 30);

        System.out.println("a1 평균값: " + a1);
        System.out.println("a2 평균값: " + a2);
    }

    private static double average(int a, int b, int c) {
        int sum = a + b + c;

        return sum / 3.0;

    }


}
