package loop;

public class For2 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; true; i++) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("i : " + i + "sum : " + sum);
                break;
            }
            System.out.println("i : " + i + "sum : " + sum);
        }
    }

}
