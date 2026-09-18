package Scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산해 드림.");

        int sum = 0;
        
        while (true) {
            System.out.print("숫자를 입력해 주세요.");
            int num1 = scanner.nextInt();

            if (num1 == 0) {
                System.out.println("합계 : " + sum + " 으로 종료합니다.");
                break;
            }
            sum += num1;

            System.out.println("현재 합계 : " + sum);

        }
    }
}
