package Scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("첫번째숫자를 입력해 주세요.");
            int num1 = scanner.nextInt();

            System.out.print("두번째숫자를 입력해 주세요.");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("종료합니다");
                break;
            }

                System.out.println(num1 + num2);



        }
    }
}
