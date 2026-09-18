package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            System.out.println("i : " + i + " sum : " + sum);
            if (sum > 10) {
                System.out.println("끝-----" + "i : " + i + " sum : " + sum);
                break;
            }
            i++;
        }
    }

}
