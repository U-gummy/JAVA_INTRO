package method;

public class Method1 {
    public static void main(String[] args) {

        int sum1 = add(1, 2);
        System.out.println("결과1 출력:" + sum1);


        int sum2 = add(4, 10);
        System.out.println("결과1 출력:" + sum2);

        String a = addS("a", "bbbbbbb");
        System.out.println(a);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static String addS(String a, String b) {
        return a + "룰루" + b;
    }
}
